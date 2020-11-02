package ntk.android.base.services.core;

import android.content.Context;

import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import ntk.android.base.api.core.entity.TokenInfoModel;
import ntk.android.base.config.ConfigRestHeader;
import ntk.android.base.config.RetrofitManager;
import ntk.android.base.dtoModel.core.TokenDeviceClientInfoDtoModel;
import ntk.android.base.entityModel.base.ErrorException;

public class CoreAuthService {
    private final Map<String, String> headers;
    String baseUrl = "api/v1/";
    String controlerUrl = "Auth";
    Context context;

    public CoreAuthService(Context context) {
        this.context = context;
        headers = new ConfigRestHeader().GetHeaders(context);
    }


    Icore Icore() {
        Icore iCore = new RetrofitManager(context).getRetrofitUnCached().create(Icore.class);
        return iCore;

    }

    public Observable<ErrorException<TokenInfoModel>> getTokenDevice(TokenDeviceClientInfoDtoModel request) {
        BehaviorSubject<ErrorException<TokenInfoModel>> mMovieCache = BehaviorSubject.create();
        Observable<ErrorException<TokenInfoModel>> tokenDevice = Icore().getTokenDevice(baseUrl + controlerUrl + "/GetTokenDevice", headers, request);
        tokenDevice.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<TokenInfoModel>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
            }

            @Override
            public void onNext(@NonNull ErrorException<TokenInfoModel> o) {
                mMovieCache.onNext(o);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                mMovieCache.onError(e);
            }

            @Override
            public void onComplete() {
            }
        });
        return mMovieCache;
    }
}

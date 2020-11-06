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
import ntk.android.base.BaseNtkApplication;
import ntk.android.base.api.core.entity.TokenInfoModel;
import ntk.android.base.config.ConfigRestHeader;
import ntk.android.base.config.RetrofitManager;
import ntk.android.base.dtomodel.core.TokenDeviceClientInfoDtoModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.enums.EnumDeviceType;
import ntk.android.base.entitymodel.enums.EnumOperatingSystemType;

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

    public Observable<ErrorException<TokenInfoModel>> getTokenDevice() {
        TokenDeviceClientInfoDtoModel request = new TokenDeviceClientInfoDtoModel();
        request.OSType = EnumOperatingSystemType.GoogleAndroid.index();
        request.DeviceType = EnumDeviceType.Android.index();
        request.PackageName = BaseNtkApplication.get().getPackageName();
        request.SecurityKey="123";
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

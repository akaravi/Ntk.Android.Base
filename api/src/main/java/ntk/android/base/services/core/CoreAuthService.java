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
import ntk.android.base.config.ConfigRestHeader;
import ntk.android.base.config.RetrofitManager;
import ntk.android.base.dtomodel.core.AuthUserSignUpModel;
import ntk.android.base.dtomodel.core.TokenDeviceClientInfoDtoModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.TokenInfoModel;
import ntk.android.base.entitymodel.core.CoreUserModel;
import ntk.android.base.entitymodel.enums.EnumDeviceType;
import ntk.android.base.entitymodel.enums.EnumOperatingSystemType;

public class CoreAuthService {
    private final Map<String, String> headers;
    String baseUrl = "api/v1/";
    String controlerUrl = "auth";
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
        Icore().getTokenDevice(baseUrl + controlerUrl + "/GetTokenDevice", headers, request)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<TokenInfoModel>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
            }

            @Override
            public void onNext(@NonNull ErrorException<TokenInfoModel> o) {
                if (o.IsSuccess) {
                    new ConfigRestHeader().replaceToken(context, o.Item.DeviceToken);
                    mMovieCache.onNext(o);
                } else

                    mMovieCache.onError(new Exception("Ntk Exepction:" + o.ErrorMessage));
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

    public Observable<ErrorException<TokenInfoModel>> getTokenDevice() {
        TokenDeviceClientInfoDtoModel request = new TokenDeviceClientInfoDtoModel();
        request.OSType = EnumOperatingSystemType.GoogleAndroid.index();
        request.DeviceType = EnumDeviceType.Android.index();
        request.PackageName = BaseNtkApplication.get().getPackageName();
        request.SecurityKey = "123456789";
        return getTokenDevice(request);
    }

    public Observable<ErrorException<CoreUserModel>> signUpUser(AuthUserSignUpModel model) {
        BehaviorSubject<ErrorException<CoreUserModel>> mMovieCache = BehaviorSubject.create();
        Icore().signupUser(baseUrl + controlerUrl + "/signup", headers, model)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<CoreUserModel>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<CoreUserModel> tokenInfoModelErrorException) {
                mMovieCache.onNext(tokenInfoModelErrorException);
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

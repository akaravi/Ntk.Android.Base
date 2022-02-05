package ntk.android.base.services.core;

import android.content.Context;
import android.provider.Settings;
import android.telephony.TelephonyManager;

import com.jakewharton.retrofit2.adapter.rxjava2.HttpException;

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
import ntk.android.base.config.TokenDeviceExp;
import ntk.android.base.dtomodel.core.AuthEmailConfirmDtoModel;
import ntk.android.base.dtomodel.core.AuthMobileConfirmDtoModel;
import ntk.android.base.dtomodel.core.AuthUserForgetPasswordModel;
import ntk.android.base.dtomodel.core.AuthUserSignInBySmsDtoModel;
import ntk.android.base.dtomodel.core.AuthUserSignInModel;
import ntk.android.base.dtomodel.core.AuthUserSignUpModel;
import ntk.android.base.dtomodel.core.TokenDeviceClientInfoDtoModel;
import ntk.android.base.dtomodel.core.TokenDeviceModel;
import ntk.android.base.entitymodel.base.CaptchaModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import ntk.android.base.entitymodel.base.TokenInfoModel;
import ntk.android.base.entitymodel.core.CoreUserModel;
import ntk.android.base.entitymodel.enums.EnumDeviceType;
import ntk.android.base.entitymodel.enums.EnumOperatingSystemType;
import ntk.android.base.utill.AppUtil;
import ntk.android.base.utill.prefrense.Preferences;


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

    public Observable<ErrorException<CaptchaModel>> getCaptcha() {
        BehaviorSubject<ErrorException<CaptchaModel>> mMovieCache = BehaviorSubject.create();
        Icore().Captcha()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<CaptchaModel>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<CaptchaModel> model) {
                mMovieCache.onNext(model);
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

    public Observable<ErrorException<TokenDeviceModel>> getTokenDevice() {
        TokenDeviceClientInfoDtoModel request = new TokenDeviceClientInfoDtoModel();
        request.OSType = EnumOperatingSystemType.GoogleAndroid.index();
        request.DeviceType = EnumDeviceType.Android.index();
        request.PackageName = BaseNtkApplication.get().getPackageName();
        request.SecurityKey = "";
        request.LocationLat = "0";
        request.LocationLong = "0";
        request.DeviceBrand = AppUtil.GetDeviceName();
        request.Country = "IR";
        request.Language = BaseNtkApplication.get().getLanguage();
        request.SimCard = ((TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE)).getSimOperatorName();
        request.AppBuildVer = Integer.parseInt(String.valueOf(BaseNtkApplication.get().getApplicationParameter().VERSION_CODE()));//String.valueOf(BuildConfig.VERSION_CODE));
        request.AppSourceVer = BaseNtkApplication.get().getApplicationParameter().VERSION_NAME();
        request.NotificationId = Preferences.with(context).appVariableInfo().notificationId();
        request.ClientMACAddress = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        return getTokenDevice(request);
    }

    public Observable<ErrorException<TokenDeviceModel>> getTokenDevice(TokenDeviceClientInfoDtoModel request) {
        BehaviorSubject<ErrorException<TokenDeviceModel>> mMovieCache = BehaviorSubject.create();
        Icore().GetTokenDevice(baseUrl + controlerUrl + "/GetTokenDevice", headers, request)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<TokenDeviceModel>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
            }

            @Override
            public void onNext(@NonNull ErrorException<TokenDeviceModel> o) {
                if (o.IsSuccess) {
                    Preferences.with(context).tokenInfo().setDeviceToken(o.Item.DeviceToken);
//                    Preferences.with(context).tokenInfo().setAuthorizationToken(o.Item.Token);
                    Preferences.with(context).UserInfo().setSiteId(o.Item.LinkSiteId);
//                    Preferences.with(context).UserInfo().setMemberUserId(o.Item.MemberId);
                    mMovieCache.onNext(o);
                } else

                    mMovieCache.onError(new Exception("Ntk Exepction:" + o.ErrorMessage));
            }

            @Override
            public void onError(@NonNull Throwable e) {
                if (e instanceof HttpException) {
                    if (((HttpException) e).code() == 401) {
                        Preferences.with(context).tokenInfo().setDeviceToken("");
                        Preferences.with(context).tokenInfo().setAuthorizationToken("");
                        Preferences.with(context).UserInfo().setMemberUserId(0);
                        Preferences.with(context).appVariableInfo().setIsLogin(false);
                        mMovieCache.onError(new TokenDeviceExp());
                        return;
                    }
                }
                mMovieCache.onError(e);
            }

            @Override
            public void onComplete() {
            }
        });
        return mMovieCache;
    }

    public Observable<ErrorException<TokenInfoModel>> correctTokenInfo() {
        BehaviorSubject<ErrorException<TokenInfoModel>> mMovieCache = BehaviorSubject.create();
        Icore().CorrectTokenInfo(headers).observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<TokenInfoModel>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<TokenInfoModel> tokenInfoModel) {
                if (tokenInfoModel.IsSuccess) {
                    Preferences.with(context).tokenInfo().setAuthorizationToken(tokenInfoModel.Item.Token);
                    Preferences.with(context).UserInfo().setMemberUserId(tokenInfoModel.Item.MemberId);
                    mMovieCache.onNext(tokenInfoModel);
                } else
                    mMovieCache.onError(new Exception("Ntk Exepction:" + tokenInfoModel.ErrorMessage));
            }

            @Override
            public void onError(@NonNull Throwable e) {
                if (e instanceof HttpException) {
                    if (((HttpException) e).code() == 401) {
                        Preferences.with(context).tokenInfo().setDeviceToken("");
                        Preferences.with(context).tokenInfo().setAuthorizationToken("");
                        Preferences.with(context).UserInfo().setMemberUserId(0);
                       Preferences.with(context).appVariableInfo().setIsLogin(false);
                       mMovieCache.onError(new TokenDeviceExp());
                       return;
                    }
                }
                mMovieCache.onError(e);
            }

            @Override
            public void onComplete() {

            }
        });
        return mMovieCache;
    }

    public Observable<ErrorException<CoreUserModel>> signUpUser(AuthUserSignUpModel model) {
        BehaviorSubject<ErrorException<CoreUserModel>> mMovieCache = BehaviorSubject.create();
        Icore().SignUpUser(baseUrl + controlerUrl + "/signup", headers, model)
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

    public Observable<ErrorExceptionBase> confirmMobile(AuthMobileConfirmDtoModel request) {
        BehaviorSubject<ErrorExceptionBase> mMovieCache = BehaviorSubject.create();
        Icore().MobileConfirm(baseUrl + controlerUrl + "/mobileConfirm", headers, request)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorExceptionBase>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
            }

            @Override
            public void onNext(@NonNull ErrorExceptionBase o) {
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

    public Observable<ErrorExceptionBase> confirmEmail(AuthEmailConfirmDtoModel request) {
        BehaviorSubject<ErrorExceptionBase> mMovieCache = BehaviorSubject.create();
        Icore().EmailConfirm(baseUrl + controlerUrl + "/emailConfirm", headers, request)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorExceptionBase>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
            }

            @Override
            public void onNext(@NonNull ErrorExceptionBase o) {
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

    public Observable<ErrorException<TokenInfoModel>> signInUser(AuthUserSignInModel request) {
        request.lang = BaseNtkApplication.get().getLanguage();
        BehaviorSubject<ErrorException<TokenInfoModel>> mMovieCache = BehaviorSubject.create();
        Icore().SignInUser(baseUrl + controlerUrl + "/signin", headers, request)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<TokenInfoModel>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
            }

            @Override
            public void onNext(@NonNull ErrorException<TokenInfoModel> o) {
                if (o.IsSuccess) {
                    Preferences.with(context).tokenInfo().setDeviceToken(o.Item.DeviceToken);
                    Preferences.with(context).tokenInfo().setAuthorizationToken(o.Item.Token);
                    Preferences.with(context).UserInfo().setSiteId(o.Item.SiteId);
                    Preferences.with(context).appVariableInfo().setIsLogin(true);
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

    public Observable<ErrorException<TokenInfoModel>> forgetPassword(AuthUserForgetPasswordModel req) {
        BehaviorSubject<ErrorException<TokenInfoModel>> mMovieCache = BehaviorSubject.create();
        Icore().ForgetPassword(baseUrl + controlerUrl + "/forgetPassword", headers, req)
                .observeOn(AndroidSchedulers.mainThread())
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

    public Observable<ErrorException<TokenInfoModel>> signInUserBySMS(AuthUserSignInBySmsDtoModel req) {
        req.lang = BaseNtkApplication.get().getLanguage();
        BehaviorSubject<ErrorException<TokenInfoModel>> mMovieCache = BehaviorSubject.create();
        Icore().SignInUserBySMS(baseUrl + controlerUrl + "/signInBySms", headers, req)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<TokenInfoModel>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
            }

            @Override
            public void onNext(@NonNull ErrorException<TokenInfoModel> o) {
                if (o.IsSuccess) {
                    Preferences.with(context).tokenInfo().setAuthorizationToken(o.Item.Token);
                }
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

package ntk.android.base.services.core;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.api.baseModel.FilterModelPrev;
import ntk.android.base.dtomodel.core.AuthEmailConfirmDtoModel;
import ntk.android.base.dtomodel.core.AuthMobileConfirmDtoModel;
import ntk.android.base.dtomodel.core.AuthRenewTokenModel;
import ntk.android.base.dtomodel.core.AuthUserChangePasswordModel;
import ntk.android.base.dtomodel.core.AuthUserForgetPasswordModel;
import ntk.android.base.dtomodel.core.AuthUserSignInBySmsDtoModel;
import ntk.android.base.dtomodel.core.AuthUserSignInModel;
import ntk.android.base.dtomodel.core.AuthUserSignOutModel;
import ntk.android.base.dtomodel.core.AuthUserSignUpModel;
import ntk.android.base.dtomodel.core.TokenDeviceClientInfoDtoModel;
import ntk.android.base.entitymodel.base.CaptchaModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import ntk.android.base.entitymodel.base.TokenInfoModel;
import ntk.android.base.entitymodel.core.CoreUserModel;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

interface Icore {
    @GET("api/v1/auth/captcha")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<CaptchaModel>> Captcha();

    @GET("api/v1/auth/CorrectToken")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<CaptchaModel>>  CorrectTokenInfo();

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<TokenInfoModel>> GetTokenDevice(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body TokenDeviceClientInfoDtoModel request);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorExceptionBase> MobileConfirm(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body AuthMobileConfirmDtoModel model);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorExceptionBase> EmailConfirm(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body AuthEmailConfirmDtoModel model);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<CoreUserModel>> SignUpUser(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body AuthUserSignUpModel model);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<TokenInfoModel>> SignInUser(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body AuthUserSignInModel model);

    Observable<ErrorException<TokenInfoModel>> renewToken(AuthRenewTokenModel model);

    Observable<ErrorException<TokenInfoModel>> changePassword(AuthUserChangePasswordModel model);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<TokenInfoModel>> ForgetPassword(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body AuthUserForgetPasswordModel model);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<TokenInfoModel>> SignInUserBySMS(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body AuthUserSignInBySmsDtoModel model);

    Observable<ErrorExceptionBase> logout(AuthUserSignOutModel model);

    Observable<ErrorExceptionBase> existToken(FilterModelPrev model);
}
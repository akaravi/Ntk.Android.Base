package ntk.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.core.model.CoreAboutUsResponse;
import ntk.base.api.core.model.ButtonResponse;
import ntk.base.api.core.model.CoreLocationRequest;
import ntk.base.api.core.model.CoreLocationResponse;
import ntk.base.api.core.model.CoreTheme;
import ntk.base.api.core.model.CoreUserResponse;
import ntk.base.api.core.model.CoreUserChangePasswordRequest;
import ntk.base.api.core.model.CoreUserEmailConfirmRequest;
import ntk.base.api.core.model.CoreUserConfirmResponse;
import ntk.base.api.core.model.CoreUserForgetPasswordRequest;
import ntk.base.api.core.model.CoreUserLoginByMobileRequest;
import ntk.base.api.core.model.CoreUserLoginRequest;
import ntk.base.api.core.model.CoreUserMobileConfirmRequest;
import ntk.base.api.core.model.CoreUserRegisterByMobileRequest;
import ntk.base.api.core.model.CoreUserRegisterRequest;
import ntk.base.api.core.model.ImageResponse;
import ntk.base.api.core.model.MainCoreResponse;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ICore {

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: Main"})
    Observable<MainCoreResponse> GetResponseMain(@HeaderMap Map<String, String> headers);

    @GET("api/app/")
    @Headers({"content-type: application/json", "layout: Main"})
    Observable<MainCoreResponse> GET_GetResponseMain(@HeaderMap Map<String, String> headers);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: CoreBotton"})
    Observable<ButtonResponse> GetButtons(@HeaderMap Map<String, String> headers);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: CoreImage"})
    Observable<ImageResponse> GetImage(@HeaderMap Map<String, String> headers);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: CoreAboutUs"})
    Observable<CoreAboutUsResponse> GetAbout(@HeaderMap Map<String, String> headers);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: CoreUserRegisterByMobile"})
    Observable<CoreUserResponse> RegisterWithMobile(@HeaderMap Map<String, String> headers, @Body CoreUserRegisterByMobileRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: CoreLocationList"})
    Observable<CoreLocationResponse> GetLocation(@HeaderMap Map<String, String> headers, @Body CoreLocationRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: CoreUserChangePassword"})
    Observable<CoreUserResponse> SetUserNewPassword(@HeaderMap Map<String, String> headers, @Body CoreUserChangePasswordRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: CoreUserEmailConfirm"})
    Observable<CoreUserConfirmResponse> userEmailConfirm(@HeaderMap Map<String, String> headers, @Body CoreUserEmailConfirmRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: CoreUserForgetPassword"})
    Observable<CoreUserResponse> userForgetPassword(@HeaderMap Map<String, String> headers, @Body CoreUserForgetPasswordRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: CoreUserLogin"})
    Observable<CoreUserResponse> userLogin(@HeaderMap Map<String, String> headers, @Body CoreUserLoginRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: CoreUserLoginByMobile"})
    Observable<CoreUserResponse> userLoginByMobile(@HeaderMap Map<String, String> headers, @Body CoreUserLoginByMobileRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: CoreUserMobileConfirm"})
    Observable<CoreUserConfirmResponse> userMobileConfirm(@HeaderMap Map<String, String> headers, @Body CoreUserMobileConfirmRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: CoreUserRegister"})
    Observable<CoreUserResponse> setUserRegister(@HeaderMap Map<String, String> headers, @Body CoreUserRegisterRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: Theme"})
    Observable<CoreTheme> GetThemeCore(@HeaderMap Map<String, String> headers);

}

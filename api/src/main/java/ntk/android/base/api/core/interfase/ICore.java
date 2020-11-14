package ntk.android.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.api.core.entity.CoreTheme;
import ntk.android.base.api.core.model.ButtonResponse;
import ntk.android.base.api.core.model.CoreAboutUsResponse;
import ntk.android.base.api.core.model.CoreLocationRequest;
import ntk.android.base.api.core.model.CoreLocationResponse;
import ntk.android.base.api.core.model.CoreUserChangePasswordRequest;
import ntk.android.base.api.core.model.CoreUserConfirmEmailRequest;
import ntk.android.base.api.core.model.CoreUserConfirmMobileRequest;
import ntk.android.base.api.core.model.CoreUserConfirmResponse;
import ntk.android.base.api.core.model.CoreUserForgetPasswordRequest;
import ntk.android.base.api.core.model.CoreUserLoginRequest;
import ntk.android.base.api.core.model.CoreUserRegisterByMobileRequest;
import ntk.android.base.api.core.model.CoreUserRegisterRequest;
import ntk.android.base.api.core.model.CoreUserResponse;
import ntk.android.base.api.core.model.ImageResponse;
import ntk.android.base.api.core.model.MainCoreResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ICore {



    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: Main"})
    Observable<MainCoreResponse> GetResponseMain(@HeaderMap Map<String, String> headers);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreBotton"})
    Observable<ButtonResponse> GetButtons(@HeaderMap Map<String, String> headers);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreImage"})
    Observable<ImageResponse> GetImage(@HeaderMap Map<String, String> headers);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreAboutUs"})
    Observable<CoreAboutUsResponse> GetAbout(@HeaderMap Map<String, String> headers);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreUserActRegisterByMobile"})
    Observable<CoreUserResponse> RegisterWithMobile(@HeaderMap Map<String, String> headers, @Body CoreUserRegisterByMobileRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreLocationActList"})
    Observable<CoreLocationResponse> GetLocation(@HeaderMap Map<String, String> headers, @Body CoreLocationRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreUserActChangePassword"})
    Observable<CoreUserResponse> SetUserNewPassword(@HeaderMap Map<String, String> headers, @Body CoreUserChangePasswordRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreUserActEmailConfirm"})
    Observable<CoreUserConfirmResponse> userEmailConfirm(@HeaderMap Map<String, String> headers, @Body CoreUserConfirmEmailRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreUserActForgetPassword"})
    Observable<CoreUserResponse> userForgetPassword(@HeaderMap Map<String, String> headers, @Body CoreUserForgetPasswordRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreUserActLogin"})
    Observable<CoreUserResponse> userLogin(@HeaderMap Map<String, String> headers, @Body CoreUserLoginRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreUserActMobileConfirm"})
    Observable<CoreUserConfirmResponse> userMobileConfirm(@HeaderMap Map<String, String> headers, @Body CoreUserConfirmMobileRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreUserActRegister"})
    Observable<CoreUserResponse> setUserRegister(@HeaderMap Map<String, String> headers, @Body CoreUserRegisterRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: Theme"})
    Observable<CoreTheme> GetThemeCore(@HeaderMap Map<String, String> headers);

}

package ntk.android.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.api.core.entity.CoreThemePrev;
import ntk.android.base.api.core.model.ButtonResponsePrev;
import ntk.android.base.api.core.model.CoreAboutUsResponsePrev;
import ntk.android.base.api.core.model.CoreLocationRequestPrev;
import ntk.android.base.api.core.model.CoreLocationResponsePrev;
import ntk.android.base.api.core.model.CoreUserChangePasswordRequestPrev;
import ntk.android.base.api.core.model.CoreUserConfirmEmailRequestPrev;
import ntk.android.base.api.core.model.CoreUserConfirmMobileRequestPrev;
import ntk.android.base.api.core.model.CoreUserConfirmResponsePrev;
import ntk.android.base.api.core.model.CoreUserForgetPasswordRequestPrev;
import ntk.android.base.api.core.model.CoreUserLoginRequestPrev;
import ntk.android.base.api.core.model.CoreUserRegisterByMobileRequestPrev;
import ntk.android.base.api.core.model.CoreUserRegisterRequestPrev;
import ntk.android.base.api.core.model.CoreUserResponsePrev;
import ntk.android.base.api.core.model.ImageResponsePrev;
import ntk.android.base.api.core.model.MainCoreResponsePrev;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

 interface ICore {



    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: Main"})
    Observable<MainCoreResponsePrev> GetResponseMain(@HeaderMap Map<String, String> headers);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreBotton"})
    Observable<ButtonResponsePrev> GetButtons(@HeaderMap Map<String, String> headers);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreImage"})
    Observable<ImageResponsePrev> GetImage(@HeaderMap Map<String, String> headers);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreAboutUs"})
    Observable<CoreAboutUsResponsePrev> GetAbout(@HeaderMap Map<String, String> headers);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreUserActRegisterByMobile"})
    Observable<CoreUserResponsePrev> RegisterWithMobile(@HeaderMap Map<String, String> headers, @Body CoreUserRegisterByMobileRequestPrev request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreLocationActList"})
    Observable<CoreLocationResponsePrev> GetLocation(@HeaderMap Map<String, String> headers, @Body CoreLocationRequestPrev request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreUserActChangePassword"})
    Observable<CoreUserResponsePrev> SetUserNewPassword(@HeaderMap Map<String, String> headers, @Body CoreUserChangePasswordRequestPrev request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreUserActEmailConfirm"})
    Observable<CoreUserConfirmResponsePrev> userEmailConfirm(@HeaderMap Map<String, String> headers, @Body CoreUserConfirmEmailRequestPrev request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreUserActForgetPassword"})
    Observable<CoreUserResponsePrev> userForgetPassword(@HeaderMap Map<String, String> headers, @Body CoreUserForgetPasswordRequestPrev request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreUserActLogin"})
    Observable<CoreUserResponsePrev> userLogin(@HeaderMap Map<String, String> headers, @Body CoreUserLoginRequestPrev request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreUserActMobileConfirm"})
    Observable<CoreUserConfirmResponsePrev> userMobileConfirm(@HeaderMap Map<String, String> headers, @Body CoreUserConfirmMobileRequestPrev request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreUserActRegister"})
    Observable<CoreUserResponsePrev> setUserRegister(@HeaderMap Map<String, String> headers, @Body CoreUserRegisterRequestPrev request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: Theme"})
    Observable<CoreThemePrev> GetThemeCore(@HeaderMap Map<String, String> headers);

}

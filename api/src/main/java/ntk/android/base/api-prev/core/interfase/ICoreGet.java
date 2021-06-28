package ntk.android.base.api.core.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.api.core.model.CaptchaResponcePrev;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;

 interface ICoreGet {
    @GET("api/v1/Auth/Captcha")
    @Headers({"content-type: application/json", "layout: Main"})
    Observable<CaptchaResponcePrev> GetCaptcha(@HeaderMap Map<String, String> headers);
}

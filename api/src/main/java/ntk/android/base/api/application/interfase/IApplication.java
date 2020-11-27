package ntk.android.base.api.application.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.api.application.model.PrevApplicationIntroRequest;
import ntk.android.base.api.application.model.PrevApplicationIntroResponse;
import ntk.android.base.api.application.model.PrevApplicationScoreRequest;
import ntk.android.base.api.application.model.PrevApplicationScoreResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IApplication {

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ApplicationScoreActSubmit"})
    Observable<PrevApplicationScoreResponse> SetScoreApplication(@HeaderMap Map<String, String> headers, @Body PrevApplicationScoreRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ApplicationIntroActList"})
    Observable<PrevApplicationIntroResponse> GetApplicationIntro(@HeaderMap Map<String, String> headers, @Body PrevApplicationIntroRequest request);
}

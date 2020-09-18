package ntk.base.api.application.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.application.model.ApplicationIntroRequest;
import ntk.base.api.application.model.ApplicationIntroResponse;
import ntk.base.api.application.model.ApplicationScoreRequest;
import ntk.base.api.application.model.ApplicationScoreResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IApplication {

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ApplicationScoreActSubmit"})
    Observable<ApplicationScoreResponse> SetScoreApplication(@HeaderMap Map<String, String> headers, @Body ApplicationScoreRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ApplicationIntroActList"})
    Observable<ApplicationIntroResponse> GetApplicationIntro(@HeaderMap Map<String, String> headers, @Body ApplicationIntroRequest request);
}

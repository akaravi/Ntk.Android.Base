package ntk.android.base.services.application;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.dtomodel.application.ApplicationScoreDtoModel;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

interface ICmsApiApplication {
    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    public Observable<ErrorExceptionBase> ScoreClick(@Path("cpath") String cpath, @HeaderMap Map<String, String> headers, @Body ApplicationScoreDtoModel request);

}

package ntk.android.base.services.base;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.dtomodel.core.ScoreClickDtoModel;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

interface ICmsApiScoreApi {

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorExceptionBase> ScoreClick(@Path(value = "cpath",encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body ScoreClickDtoModel request);

}

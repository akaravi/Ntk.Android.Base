package ntk.android.base.services.base;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.FilterModel;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

interface ICmsApiSimilar {
    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException> GetAllSimilar(@Path(value = "cpath",encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body FilterModel request);

}

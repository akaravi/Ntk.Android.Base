package ntk.android.base.services.base;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface ICmsApiLike {
    @GET("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorExceptionBase> LikeClick(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers);

    @GET("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorExceptionBase> DisLikeClick(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers);
}

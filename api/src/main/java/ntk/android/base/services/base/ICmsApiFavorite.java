package ntk.android.base.services.base;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import ntk.android.base.entitymodel.base.FilterModel;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

interface ICmsApiFavorite<TEntity, TKey> {


    @GET("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorExceptionBase> AddFavorite(@Path(value = "cpath",encoded = true) String cpath, @HeaderMap Map<String, String> headers);

    @GET("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorExceptionBase> FavoriteRemove(@Path(value = "cpath",encoded = true) String cpath, @HeaderMap Map<String, String> headers);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException> GetFavoriteList(@Path(value = "cpath",encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body FilterModel request);
}

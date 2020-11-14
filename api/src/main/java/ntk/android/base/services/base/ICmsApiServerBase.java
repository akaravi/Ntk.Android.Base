package ntk.android.base.services.base;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import ntk.android.base.entitymodel.base.FilterDataModel;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
public interface ICmsApiServerBase<TEntity,TKey> {


    @GET("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException> getViewModel(@Path(value = "cpath",encoded = true) String cpath, @HeaderMap Map<String, String> headers);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})

    Observable<ErrorException> getAll(@Path(value = "cpath",encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body FilterDataModel request);

    @GET("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException> getOne(@Path(value = "cpath",encoded = true) String cpath, @HeaderMap Map<String, String> headers);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorExceptionBase> Exist(@Path(value = "cpath",encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body FilterDataModel request);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorExceptionBase> Count(@Path(value = "cpath",encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body FilterDataModel request);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException> ExportFile(@Path(value = "cpath",encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body FilterDataModel request);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException> Add(@Path(value = "cpath",encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body Object request);

    @PUT("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException> Edit(@Path(value = "cpath",encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body Object request);

    @DELETE("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException> Delete(@Path(value = "cpath",encoded = true) String cpath, @HeaderMap Map<String, String> headers);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException> Delete(@Path(value = "cpath",encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body List<Object> request);
}

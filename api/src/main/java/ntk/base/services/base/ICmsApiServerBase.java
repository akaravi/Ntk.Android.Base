package ntk.base.services.base;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import ntk.base.entityModel.base.ErrorException;
import ntk.base.entityModel.base.ErrorExceptionBase;
import ntk.base.entityModel.base.FilterModel;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ICmsApiServerBase<TEntity, TKey> {

    @GET()
    @Headers({"content-type: application/json"})
    Observable<ErrorException<TEntity>> getViewModel(@Path("") String layout, @HeaderMap Map<String, String> headers, @Body TEntity request);

    @POST()
    @Headers({"content-type: application/json"})
    Observable<ErrorException<TEntity>> getAll(@Path("layout") String layout, @HeaderMap Map<String, String> headers, @Body FilterModel request);

    @GET()
    @Headers({"content-type: application/json"})
    Observable<ErrorException<TEntity>> getViewModel(@Path("layout") String layout, @HeaderMap Map<String, String> headers);

    @POST()
    @Headers({"content-type: application/json"})
    Observable<ErrorExceptionBase> Exist(@Path("layout") String layout, @HeaderMap Map<String, String> headers, @Body FilterModel request);

    @POST()
    @Headers({"content-type: application/json"})
    Observable<ErrorExceptionBase> Count(@Path("layout") String layout, @HeaderMap Map<String, String> headers, @Body FilterModel request);

    @POST()
    @Headers({"content-type: application/json"})
    Observable<ErrorExceptionBase> ExportFile(@Path("layout") String layout, @HeaderMap Map<String, String> headers, @Body FilterModel request);

    @POST()
    @Headers({"content-type: application/json"})
    Observable<ErrorException<TEntity>> Add(@Path("layout") String layout, @HeaderMap Map<String, String> headers, @Body TEntity request);

    @PUT()
    @Headers({"content-type: application/json"})
    Observable<ErrorException<TEntity>> Edit(@Path("layout") String layout, @HeaderMap Map<String, String> headers, @Body TEntity request);

    @DELETE()
    @Headers({"content-type: application/json"})
    Observable<ErrorException<TEntity>> Delete(@Path("layout") String layout, @HeaderMap Map<String, String> headers);

    @POST()
    @Headers({"content-type: application/json"})
    Observable<ErrorException<TEntity>> Delete(@Path("layout") String layout, @HeaderMap Map<String, String> headers, @Body List<TKey> request);
}

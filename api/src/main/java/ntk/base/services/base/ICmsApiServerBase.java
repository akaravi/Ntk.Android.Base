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

public interface ICmsApiServerBase <TEntity, TKey> {

    @GET("api/v1/NewsConstent/getViewModel")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<TEntity>> getViewModel(@HeaderMap Map<String, String> headers, @Body TEntity request);

    @POST("api/v1/NewsConstent/getAll")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<TEntity>> getAll(@HeaderMap Map<String, String> headers, @Body FilterModel request);

    @GET("api/v1/NewsConstent/1")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<TEntity>> getViewModel(@HeaderMap Map<String, String> headers);

    @POST("api/v1/NewsConstent/Exist")
    @Headers({"content-type: application/json"})
    Observable<ErrorExceptionBase> Exist(@HeaderMap Map<String, String> headers, @Body FilterModel request);

    @POST("api/v1/NewsConstent/Count")
    @Headers({"content-type: application/json"})
    Observable<ErrorExceptionBase> Count(@HeaderMap Map<String, String> headers, @Body FilterModel request);

    @POST("api/v1/NewsConstent/ExportFile")
    @Headers({"content-type: application/json"})
    Observable<ErrorExceptionBase> ExportFile(@HeaderMap Map<String, String> headers, @Body FilterModel request);

    @POST("api/v1/NewsConstent")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<TEntity>> Add(@HeaderMap Map<String, String> headers, @Body TEntity request);

    @PUT("api/v1/NewsConstent/1")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<TEntity>> Edit(@HeaderMap Map<String, String> headers, @Body TEntity request);

    @DELETE("api/v1/NewsConstent/1")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<TEntity>> Delete(@HeaderMap Map<String, String> headers);

    @POST("api/v1/NewsConstent/DeleteList")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<TEntity>> Delete(@HeaderMap Map<String, String> headers,@Body List<TKey> request);
}

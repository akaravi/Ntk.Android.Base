package ntk.android.base.services.base;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.entitymodel.base.ErrorException;
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
    Observable<ErrorException> getViewModel(@Path("cpath") String cpath, @HeaderMap Map<String, String> headers, @Body TEntity request);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})

    Observable<ErrorException> getAll(@Path("cpath") String cpath, @HeaderMap Map<String, String> headers, @Body FilterDataModel request);

    @GET("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException> getViewModel(@Path("cpath") String cpath, @HeaderMap Map<String, String> headers);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException> Exist(@Path("cpath") String cpath, @HeaderMap Map<String, String> headers, @Body FilterDataModel request);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException> Count(@Path("cpath") String cpath, @HeaderMap Map<String, String> headers, @Body FilterDataModel request);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException> ExportFile(@Path("cpath") String cpath, @HeaderMap Map<String, String> headers, @Body FilterDataModel request);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException> Add(@Path("cpath") String cpath, @HeaderMap Map<String, String> headers, @Body TEntity request);

    @PUT("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException> Edit(@Path("cpath") String cpath, @HeaderMap Map<String, String> headers, @Body TEntity request);

    @DELETE("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException> Delete(@Path("cpath") String cpath, @HeaderMap Map<String, String> headers);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException> Delete(@Path("cpath") String cpath, @HeaderMap Map<String, String> headers, @Body List<TKey> request);
}

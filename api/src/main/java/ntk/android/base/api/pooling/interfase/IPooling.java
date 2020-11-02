package ntk.android.base.api.pooling.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.api.pooling.model.PoolingContentViewRequest;
import ntk.android.base.api.pooling.model.PoolingContentViewResponse;
import ntk.android.base.api.pooling.model.PoolingCategoryResponse;
import ntk.android.base.api.pooling.model.PoolingContentListRequest;
import ntk.android.base.api.pooling.model.PoolingContentListResponse;
import ntk.android.base.api.pooling.model.PoolingSubmitRequest;
import ntk.android.base.api.pooling.model.PoolingSubmitResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IPooling {

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: PollingContentActList"})
    Observable<PoolingContentListResponse> GetContentList(@HeaderMap Map<String, String> headers, @Body PoolingContentListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: PollingContentActView"})
    Observable<PoolingContentViewResponse> GetContentView(@HeaderMap Map<String, String> headers, @Body PoolingContentViewRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: PollingCategoryActList"})
    Observable<PoolingCategoryResponse> GetCategoryList(@HeaderMap Map<String, String> headers);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: PollingVoteActSubmit"})
    Observable<PoolingSubmitResponse> SetSubmitPooling(@HeaderMap Map<String, String> headers, @Body PoolingSubmitRequest request);

}

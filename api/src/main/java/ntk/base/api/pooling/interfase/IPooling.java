package ntk.base.api.pooling.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.pooling.model.PoolingContentViewRequest;
import ntk.base.api.pooling.model.PoolingContentViewResponse;
import ntk.base.api.pooling.model.PoolingCategoryResponse;
import ntk.base.api.pooling.model.PoolingContentListRequest;
import ntk.base.api.pooling.model.PoolingContentListResponse;
import ntk.base.api.pooling.model.PoolingSubmitRequest;
import ntk.base.api.pooling.model.PoolingSubmitResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IPooling {

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: PollingContentList"})
    Observable<PoolingContentListResponse> GetContentList(@HeaderMap Map<String, String> headers, @Body PoolingContentListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: PollingContentView"})
    Observable<PoolingContentViewResponse> GetContentView(@HeaderMap Map<String, String> headers, @Body PoolingContentViewRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: PollingCategoryList"})
    Observable<PoolingCategoryResponse> GetCategoryList(@HeaderMap Map<String, String> headers);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: PollingVoteSubmit"})
    Observable<PoolingSubmitResponse> SetSubmitPooling(@HeaderMap Map<String, String> headers, @Body PoolingSubmitRequest request);

}

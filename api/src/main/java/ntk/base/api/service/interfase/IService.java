package ntk.base.api.service.interfase;

import io.reactivex.Observable;

import java.util.Map;

import ntk.base.api.service.model.ServiceCategoryRequest;
import ntk.base.api.service.model.ServiceCategoryResponse;
import ntk.base.api.service.model.ServiceCategoryTagRequest;
import ntk.base.api.service.model.ServiceCategoryTagResponse;
import ntk.base.api.service.model.ServiceCommentAddRequest;
import ntk.base.api.service.model.ServiceCommentListRequest;
import ntk.base.api.service.model.ServiceCommentResponse;
import ntk.base.api.service.model.ServiceCommentViewRequest;
import ntk.base.api.service.model.ServiceContentCategoryListRequest;
import ntk.base.api.service.model.ServiceContentFavoriteAddRequest;
import ntk.base.api.service.model.ServiceContentFavoriteAddResponse;
import ntk.base.api.service.model.ServiceContentFavoriteListRequest;
import ntk.base.api.service.model.ServiceContentFavoriteListResponse;
import ntk.base.api.service.model.ServiceContentFavoriteRemoveRequest;
import ntk.base.api.service.model.ServiceContentFavoriteRemoveResponse;
import ntk.base.api.service.model.ServiceContentListRequest;
import ntk.base.api.service.model.ServiceContentOtherInfoRequest;
import ntk.base.api.service.model.ServiceContentOtherInfoResponse;
import ntk.base.api.service.model.ServiceContentResponse;
import ntk.base.api.service.model.ServiceContentSimilarListRequest;
import ntk.base.api.service.model.ServiceContentViewRequest;
import ntk.base.api.service.model.ServiceTagRequest;
import ntk.base.api.service.model.ServiceTagResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
public interface IService {

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout : ServiceCategoryList"})
    Observable<ServiceCategoryResponse> GetCategoryList(@HeaderMap Map<String, String> headers, @Body ServiceCategoryRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout : ServiceCategoryTagList"})
    Observable<ServiceCategoryTagResponse> GetCategoryTagList(@HeaderMap Map<String, String> headers, @Body ServiceCategoryTagRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ServiceCommentAdd"})
    Observable<ServiceCommentResponse> SetComment(@HeaderMap Map<String, String> headers, @Body ServiceCommentAddRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ServiceCommentList"})
    Observable<ServiceCommentResponse> GetCommentList(@HeaderMap Map<String, String> headers, @Body ServiceCommentListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ServiceCommentView"})
    Observable<ServiceCommentResponse> GetCommentView(@HeaderMap Map<String, String> headers, @Body ServiceCommentViewRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ServiceContentCategoryList"})
    Observable<ServiceContentResponse> GetContentCategoryList(@HeaderMap Map<String, String> headers, @Body ServiceContentCategoryListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ServiceContentFavoriteAdd"})
    Observable<ServiceContentFavoriteAddResponse> SetContentFavoriteAdd(@HeaderMap Map<String, String> headers, @Body ServiceContentFavoriteAddRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ServiceContentFavoriteList"})
    Observable<ServiceContentFavoriteListResponse> GetContentFavoriteList(@HeaderMap Map<String, String> headers, @Body ServiceContentFavoriteListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ServiceContentFavoriteList"})
    Observable<ServiceContentFavoriteRemoveResponse> SetContentFavoriteRemove(@HeaderMap Map<String, String> headers, @Body ServiceContentFavoriteRemoveRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ServiceContentList"})
    Observable<ServiceContentResponse> GetContentList(@HeaderMap Map<String, String> headers, @Body ServiceContentListRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ServiceContentOtherInfoList"})
    Observable<ServiceContentOtherInfoRequest> GetContentOtherInfoList(@HeaderMap Map<String, String> headers, @Body ServiceContentOtherInfoResponse request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ServiceContentSimilarList"})
    Observable<ServiceContentResponse> GetContentSimilarList(@HeaderMap Map<String, String> headers, @Body ServiceContentSimilarListRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ServiceContentView"})
    Observable<ServiceContentResponse> GetContentView(@HeaderMap Map<String, String> headers, @Body ServiceContentViewRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout : ServiceTagList"})
    Observable<ServiceTagResponse> GetTagList(@HeaderMap Map<String, String> headers, @Body ServiceTagRequest request);
}

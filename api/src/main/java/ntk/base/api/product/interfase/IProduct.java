package ntk.base.api.product.interfase;

import android.database.Observable;

import java.util.Map;

import ntk.base.api.product.model.ProductCategoryRequest;
import ntk.base.api.product.model.ProductCategoryResponse;
import ntk.base.api.product.model.ProductCategoryTagRequest;
import ntk.base.api.product.model.ProductCategoryTagResponse;
import ntk.base.api.product.model.ProductCommentAddRequest;
import ntk.base.api.product.model.ProductCommentListRequest;
import ntk.base.api.product.model.ProductCommentResponse;
import ntk.base.api.product.model.ProductCommentViewRequest;
import ntk.base.api.product.model.ProductContentCategoryListRequest;
import ntk.base.api.product.model.ProductContentFavoriteAddRequest;
import ntk.base.api.product.model.ProductContentFavoriteAddResponse;
import ntk.base.api.product.model.ProductContentFavoriteListRequest;
import ntk.base.api.product.model.ProductContentFavoriteListResponse;
import ntk.base.api.product.model.ProductContentFavoriteRemoveRequest;
import ntk.base.api.product.model.ProductContentFavoriteRemoveResponse;
import ntk.base.api.product.model.ProductContentListRequest;
import ntk.base.api.product.model.ProductContentOtherInfoRequest;
import ntk.base.api.product.model.ProductContentOtherInfoResponse;
import ntk.base.api.product.model.ProductContentResponse;
import ntk.base.api.product.model.ProductContentSimilarListRequest;
import ntk.base.api.product.model.ProductContentViewRequest;
import ntk.base.api.product.model.ProductTagRequest;
import ntk.base.api.product.model.ProductTagResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IProduct {

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout : ProductCategoryList"})
    Observable<ProductCategoryResponse> GetCategoryList(@HeaderMap Map<String, String> headers, @Body ProductCategoryRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout : ProductCategoryTagList"})
    Observable<ProductCategoryTagResponse> GetCategoryTagList(@HeaderMap Map<String, String> headers, @Body ProductCategoryTagRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ProductCommentAdd"})
    Observable<ProductCommentResponse> SetComment(@HeaderMap Map<String, String> headers, @Body ProductCommentAddRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ProductCommentList"})
    Observable<ProductCommentResponse> GetCommentList(@HeaderMap Map<String, String> headers, @Body ProductCommentListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ProductCommentView"})
    Observable<ProductCommentResponse> GetCommentView(@HeaderMap Map<String, String> headers, @Body ProductCommentViewRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ProductContentCategoryList"})
    Observable<ProductContentResponse> GetContentCategoryList(@HeaderMap Map<String, String> headers, @Body ProductContentCategoryListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ProductContentFavoriteAdd"})
    Observable<ProductContentFavoriteAddResponse> SetContentFavoriteAdd(@HeaderMap Map<String, String> headers, @Body ProductContentFavoriteAddRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ProductContentFavoriteList"})
    Observable<ProductContentFavoriteListResponse> GetContentFavoriteList(@HeaderMap Map<String, String> headers, @Body ProductContentFavoriteListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ProductContentFavoriteList"})
    Observable<ProductContentFavoriteRemoveResponse> SetContentFavoriteRemove(@HeaderMap Map<String, String> headers, @Body ProductContentFavoriteRemoveRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ProductContentList"})
    Observable<ProductContentResponse> GetContentList(@HeaderMap Map<String, String> headers, @Body ProductContentListRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ProductContentOtherInfoList"})
    Observable<ProductContentOtherInfoRequest> GetContentOtherInfoList(@HeaderMap Map<String, String> headers, @Body ProductContentOtherInfoResponse request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ProductContentSimilarList"})
    Observable<ProductContentResponse> GetContentSimilarList(@HeaderMap Map<String, String> headers, @Body ProductContentSimilarListRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ProductContentView"})
    Observable<ProductContentResponse> GetContentView(@HeaderMap Map<String, String> headers, @Body ProductContentViewRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout : ProductTagList"})
    Observable<ProductTagResponse> GetTagList(@HeaderMap Map<String, String> headers, @Body ProductTagRequest request);
}

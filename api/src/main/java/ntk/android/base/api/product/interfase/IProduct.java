package ntk.android.base.api.product.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.api.product.model.ProductCategoryRequest;
import ntk.android.base.api.product.model.ProductCategoryResponse;
import ntk.android.base.api.product.model.ProductCategoryTagRequest;
import ntk.android.base.api.product.model.ProductCategoryTagResponse;
import ntk.android.base.api.product.model.ProductCommentAddRequest;
import ntk.android.base.api.product.model.ProductCommentListRequest;
import ntk.android.base.api.product.model.ProductCommentResponse;
import ntk.android.base.api.product.model.ProductCommentViewRequest;
import ntk.android.base.api.product.model.ProductContentCategoryListRequest;
import ntk.android.base.api.product.model.ProductContentFavoriteAddRequest;
import ntk.android.base.api.product.model.ProductContentFavoriteAddResponse;
import ntk.android.base.api.product.model.ProductContentFavoriteListRequest;
import ntk.android.base.api.product.model.ProductContentFavoriteListResponse;
import ntk.android.base.api.product.model.ProductContentFavoriteRemoveRequest;
import ntk.android.base.api.product.model.ProductContentFavoriteRemoveResponse;
import ntk.android.base.api.product.model.ProductContentListRequest;
import ntk.android.base.api.product.model.ProductContentOtherInfoRequest;
import ntk.android.base.api.product.model.ProductContentOtherInfoResponse;
import ntk.android.base.api.product.model.ProductContentResponse;
import ntk.android.base.api.product.model.ProductContentSimilarListRequest;
import ntk.android.base.api.product.model.ProductContentViewRequest;
import ntk.android.base.api.product.model.ProductTagRequest;
import ntk.android.base.api.product.model.ProductTagResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IProduct {

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ProductCategoryActList"})
    Observable<ProductCategoryResponse> GetCategoryList(@HeaderMap Map<String, String> headers, @Body ProductCategoryRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ProductCategoryTagActList"})
    Observable<ProductCategoryTagResponse> GetCategoryTagList(@HeaderMap Map<String, String> headers, @Body ProductCategoryTagRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ProductCommentActAdd"})
    Observable<ProductCommentResponse> SetComment(@HeaderMap Map<String, String> headers, @Body ProductCommentAddRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ProductCommentActList"})
    Observable<ProductCommentResponse> GetCommentList(@HeaderMap Map<String, String> headers, @Body ProductCommentListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ProductCommentActView"})
    Observable<ProductCommentResponse> GetCommentView(@HeaderMap Map<String, String> headers, @Body ProductCommentViewRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ProductContentCategoryActList"})
    Observable<ProductContentResponse> GetContentCategoryList(@HeaderMap Map<String, String> headers, @Body ProductContentCategoryListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ProductContentFavoriteActAdd"})
    Observable<ProductContentFavoriteAddResponse> SetContentFavoriteAdd(@HeaderMap Map<String, String> headers, @Body ProductContentFavoriteAddRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ProductContentFavoriteActList"})
    Observable<ProductContentFavoriteListResponse> GetContentFavoriteList(@HeaderMap Map<String, String> headers, @Body ProductContentFavoriteListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ProductContentFavoriteActList"})
    Observable<ProductContentFavoriteRemoveResponse> SetContentFavoriteRemove(@HeaderMap Map<String, String> headers, @Body ProductContentFavoriteRemoveRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ProductContentActList"})
    Observable<ProductContentResponse> GetContentList(@HeaderMap Map<String, String> headers, @Body ProductContentListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ProductContentOtherInfoActList"})
    Observable<ProductContentOtherInfoResponse> GetContentOtherInfoList(@HeaderMap Map<String, String> headers, @Body ProductContentOtherInfoRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ProductContentSimilarActList"})
    Observable<ProductContentResponse> GetContentSimilarList(@HeaderMap Map<String, String> headers, @Body ProductContentSimilarListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ProductContentActView"})
    Observable<ProductContentResponse> GetContentView(@HeaderMap Map<String, String> headers, @Body ProductContentViewRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ProductTagActList"})
    Observable<ProductTagResponse> GetTagList(@HeaderMap Map<String, String> headers, @Body ProductTagRequest request);
}

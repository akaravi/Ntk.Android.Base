package ntk.base.api.blog.interfase;

import io.reactivex.Observable;

import java.util.Map;

import ntk.base.api.blog.model.BlogCategoryListRequest;
import ntk.base.api.blog.model.BlogCategoryListResponse;
import ntk.base.api.blog.model.BlogCategoryTagListRequest;
import ntk.base.api.blog.model.BlogCategoryTagListResponse;
import ntk.base.api.blog.model.BlogCommentAddRequest;
import ntk.base.api.blog.model.BlogCommentListRequest;
import ntk.base.api.blog.model.BlogCommentResponse;
import ntk.base.api.blog.model.BlogCommentViewRequest;
import ntk.base.api.blog.model.BlogContentCategoryListRequest;
import ntk.base.api.blog.model.BlogContentFavoriteAddRequest;
import ntk.base.api.blog.model.BlogContentFavoriteAddResponse;
import ntk.base.api.blog.model.BlogContentFavoriteListRequest;
import ntk.base.api.blog.model.BlogContentFavoriteListResponse;
import ntk.base.api.blog.model.BlogContentFavoriteRemoveRequest;
import ntk.base.api.blog.model.BlogContentFavoriteRemoveResponse;
import ntk.base.api.blog.model.BlogContentListRequest;
import ntk.base.api.blog.model.BlogContentListResponse;
import ntk.base.api.blog.model.BlogContentOtherInfoListRequest;
import ntk.base.api.blog.model.BlogContentOtherInfoListResponse;
import ntk.base.api.blog.model.BlogContentResponse;
import ntk.base.api.blog.model.BlogContentSimilarListRequest;
import ntk.base.api.blog.model.BlogContentViewRequest;
import ntk.base.api.blog.model.BlogTagRequest;
import ntk.base.api.blog.model.BlogTagResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IBlog {

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogCategoryList"})
    Observable<BlogCategoryListResponse> GetCategoryList(@HeaderMap Map<String, String> headers, @Body BlogCategoryListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogCategoryTagList"})
    Observable<BlogCategoryTagListResponse> GetCategoryTagList(@HeaderMap Map<String, String> headers, @Body BlogCategoryTagListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogCommentAdd"})
    Observable<BlogCommentResponse> SetComment(@HeaderMap Map<String, String> headers, @Body BlogCommentAddRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogCommentList"})
    Observable<BlogCommentResponse> GetCommentList(@HeaderMap Map<String, String> headers, @Body BlogCommentListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogCommentView"})
    Observable<BlogCommentResponse> GetCommentView(@HeaderMap Map<String, String> headers, @Body BlogCommentViewRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogContentCategoryList"})
    Observable<BlogContentResponse> GetContentCategoryList(@HeaderMap Map<String, String> headers, @Body BlogContentCategoryListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogContentFavoriteAdd"})
    Observable<BlogContentFavoriteAddResponse> SetContentFavoriteAdd(@HeaderMap Map<String, String> headers, @Body BlogContentFavoriteAddRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogContentFavoriteList"})
    Observable<BlogContentFavoriteListResponse> GetContentFavoriteList(@HeaderMap Map<String, String> headers, @Body BlogContentFavoriteListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogContentFavoriteRemove"})
    Observable<BlogContentFavoriteRemoveResponse> SetContentFavoriteRemove(@HeaderMap Map<String, String> headers, @Body BlogContentFavoriteRemoveRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogContentList"})
    Observable<BlogContentListResponse> GetContentList(@HeaderMap Map<String, String> headers, @Body BlogContentListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogContentOtherInfoList"})
    Observable<BlogContentOtherInfoListResponse> GetContentOtherInfoList(@HeaderMap Map<String, String> headers, @Body BlogContentOtherInfoListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogContentSimilarList"})
    Observable<BlogContentResponse> GetContentSimilarList(@HeaderMap Map<String, String> headers, @Body BlogContentSimilarListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogContentView"})
    Observable<BlogContentResponse> GetContentView(@HeaderMap Map<String, String> headers, @Body BlogContentViewRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogTagList"})
    Observable<BlogTagResponse> GetTagList(@HeaderMap Map<String, String> headers, @Body BlogTagRequest request);
}

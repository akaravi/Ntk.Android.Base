package ntk.android.base.api.blog.interfase;

import io.reactivex.Observable;

import java.util.Map;

import ntk.android.base.api.blog.model.BlogCategoryListRequest;
import ntk.android.base.api.blog.model.BlogCategoryListResponse;
import ntk.android.base.api.blog.model.BlogCategoryTagListRequest;
import ntk.android.base.api.blog.model.BlogCategoryTagListResponse;
import ntk.android.base.api.blog.model.BlogCommentAddRequest;
import ntk.android.base.api.blog.model.BlogCommentListRequest;
import ntk.android.base.api.blog.model.BlogCommentResponse;
import ntk.android.base.api.blog.model.BlogCommentViewRequest;
import ntk.android.base.api.blog.model.BlogContentCategoryListRequest;
import ntk.android.base.api.blog.model.BlogContentFavoriteAddRequest;
import ntk.android.base.api.blog.model.BlogContentFavoriteAddResponse;
import ntk.android.base.api.blog.model.BlogContentFavoriteListRequest;
import ntk.android.base.api.blog.model.BlogContentFavoriteListResponse;
import ntk.android.base.api.blog.model.BlogContentFavoriteRemoveRequest;
import ntk.android.base.api.blog.model.BlogContentFavoriteRemoveResponse;
import ntk.android.base.api.blog.model.BlogContentListRequest;
import ntk.android.base.api.blog.model.BlogContentListResponse;
import ntk.android.base.api.blog.model.BlogContentOtherInfoListRequest;
import ntk.android.base.api.blog.model.BlogContentOtherInfoListResponse;
import ntk.android.base.api.blog.model.BlogContentResponse;
import ntk.android.base.api.blog.model.BlogContentSimilarListRequest;
import ntk.android.base.api.blog.model.BlogContentViewRequest;
import ntk.android.base.api.blog.model.BlogTagRequest;
import ntk.android.base.api.blog.model.BlogTagResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IBlog {

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogCategoryActList"})
    Observable<BlogCategoryListResponse> GetCategoryList(@HeaderMap Map<String, String> headers, @Body BlogCategoryListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogCategoryTagActList"})
    Observable<BlogCategoryTagListResponse> GetCategoryTagList(@HeaderMap Map<String, String> headers, @Body BlogCategoryTagListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogCommentActAdd"})
    Observable<BlogCommentResponse> SetComment(@HeaderMap Map<String, String> headers, @Body BlogCommentAddRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogCommentActList"})
    Observable<BlogCommentResponse> GetCommentList(@HeaderMap Map<String, String> headers, @Body BlogCommentListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogCommentActView"})
    Observable<BlogCommentResponse> GetCommentView(@HeaderMap Map<String, String> headers, @Body BlogCommentViewRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogContentCategoryActList"})
    Observable<BlogContentResponse> GetContentCategoryList(@HeaderMap Map<String, String> headers, @Body BlogContentCategoryListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogContentFavoriteActAdd"})
    Observable<BlogContentFavoriteAddResponse> SetContentFavoriteAdd(@HeaderMap Map<String, String> headers, @Body BlogContentFavoriteAddRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogContentFavoriteActList"})
    Observable<BlogContentFavoriteListResponse> GetContentFavoriteList(@HeaderMap Map<String, String> headers, @Body BlogContentFavoriteListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogContentFavoriteActRemove"})
    Observable<BlogContentFavoriteRemoveResponse> SetContentFavoriteRemove(@HeaderMap Map<String, String> headers, @Body BlogContentFavoriteRemoveRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogContentActList"})
    Observable<BlogContentListResponse> GetContentList(@HeaderMap Map<String, String> headers, @Body BlogContentListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogContentOtherInfoActList"})
    Observable<BlogContentOtherInfoListResponse> GetContentOtherInfoList(@HeaderMap Map<String, String> headers, @Body BlogContentOtherInfoListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogContentSimilarActList"})
    Observable<BlogContentResponse> GetContentSimilarList(@HeaderMap Map<String, String> headers, @Body BlogContentSimilarListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogContentActView"})
    Observable<BlogContentResponse> GetContentView(@HeaderMap Map<String, String> headers, @Body BlogContentViewRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BlogTagActList"})
    Observable<BlogTagResponse> GetTagList(@HeaderMap Map<String, String> headers, @Body BlogTagRequest request);
}

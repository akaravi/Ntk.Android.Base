package ntk.android.base.api.news.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.api.news.model.NewsCategoryRequest;
import ntk.android.base.api.news.model.NewsCategoryResponse;
import ntk.android.base.api.news.model.NewsCategoryTagRequest;
import ntk.android.base.api.news.model.NewsCategoryTagResponse;
import ntk.android.base.api.news.model.NewsCommentAddRequest;
import ntk.android.base.api.news.model.NewsCommentListRequest;
import ntk.android.base.api.news.model.NewsCommentViewRequest;
import ntk.android.base.api.news.model.NewsCommentResponse;
import ntk.android.base.api.news.model.NewsContentCategoryListRequest;
import ntk.android.base.api.news.model.NewsContentFavoriteAddRequest;
import ntk.android.base.api.news.model.NewsContentFavoriteAddResponse;
import ntk.android.base.api.news.model.NewsContentFavoriteListRequest;
import ntk.android.base.api.news.model.NewsContentFavoriteListResponse;
import ntk.android.base.api.news.model.NewsContentFavoriteRemoveRequest;
import ntk.android.base.api.news.model.NewsContentFavoriteRemoveResponse;
import ntk.android.base.api.news.model.NewsContentListRequest;
import ntk.android.base.api.news.model.NewsContentOtherInfoRequest;
import ntk.android.base.api.news.model.NewsContentOtherInfoResponse;
import ntk.android.base.api.news.model.NewsContentSimilarListRequest;
import ntk.android.base.api.news.model.NewsContentViewRequest;
import ntk.android.base.api.news.model.NewsContentResponse;
import ntk.android.base.api.news.model.NewsTagRequest;
import ntk.android.base.api.news.model.NewsTagResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface INews {

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: NewsContentActList"})
    Observable<NewsContentResponse> GetContentList(@HeaderMap Map<String, String> headers, @Body NewsContentListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: NewsContentActView"})
    Observable<NewsContentResponse> GetContentView(@HeaderMap Map<String, String> headers, @Body NewsContentViewRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: NewsTagActList"})
    Observable<NewsTagResponse> GetTagList(@HeaderMap Map<String, String> headers, @Body NewsTagRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: NewsCategoryActList"})
    Observable<NewsCategoryResponse> GetCategoryList(@HeaderMap Map<String, String> headers, @Body NewsCategoryRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: NewsCategoryTagActList"})
    Observable<NewsCategoryTagResponse> GetCategoryTagList(@HeaderMap Map<String, String> headers, @Body NewsCategoryTagRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: NewsContentOtherInfoActList"})
    Observable<NewsContentOtherInfoResponse> GetContentOtherInfoList(@HeaderMap Map<String, String> headers, @Body NewsContentOtherInfoRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: NewsCommentActList"})
    Observable<NewsCommentResponse> GetCommentList(@HeaderMap Map<String, String> headers, @Body NewsCommentListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: NewsCommentActAdd"})
    Observable<NewsCommentResponse> SetComment(@HeaderMap Map<String, String> headers, @Body NewsCommentAddRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: NewsCommentActView"})
    Observable<NewsCommentResponse> GetCommentView(@HeaderMap Map<String, String> headers, @Body NewsCommentViewRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: NewsContentFavoriteActAdd"})
    Observable<NewsContentFavoriteAddResponse> SetContentFavoriteAdd(@HeaderMap Map<String, String> headers, @Body NewsContentFavoriteAddRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: NewsContentFavoriteActRemove"})
    Observable<NewsContentFavoriteRemoveResponse> SetContentFavoriteRemove(@HeaderMap Map<String, String> headers, @Body NewsContentFavoriteRemoveRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: NewsContentFavoriteActList"})
    Observable<NewsContentFavoriteListResponse> GetContentFavoriteList(@HeaderMap Map<String, String> headers, @Body NewsContentFavoriteListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: NewsContentSimilarActList"})
    Observable<NewsContentResponse> GetContentSimilarList(@HeaderMap Map<String, String> headers, @Body NewsContentSimilarListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: NewsContentCategoryActList"})
    Observable<NewsContentResponse> GetContentCategoryList(@HeaderMap Map<String, String> headers, @Body NewsContentCategoryListRequest request);
}

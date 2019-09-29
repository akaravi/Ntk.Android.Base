package ntk.base.api.news.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.news.model.NewsCategoryRequest;
import ntk.base.api.news.model.NewsCategoryResponse;
import ntk.base.api.news.model.NewsCategoryTagRequest;
import ntk.base.api.news.model.NewsCategoryTagResponse;
import ntk.base.api.news.model.NewsCommentAddRequest;
import ntk.base.api.news.model.NewsCommentListRequest;
import ntk.base.api.news.model.NewsCommentViewRequest;
import ntk.base.api.news.model.NewsCommentResponse;
import ntk.base.api.news.model.NewsContentCategoryListRequest;
import ntk.base.api.news.model.NewsContentFavoriteAddRequest;
import ntk.base.api.news.model.NewsContentFavoriteAddResponse;
import ntk.base.api.news.model.NewsContentFavoriteListRequest;
import ntk.base.api.news.model.NewsContentFavoriteListResponse;
import ntk.base.api.news.model.NewsContentFavoriteRemoveRequest;
import ntk.base.api.news.model.NewsContentFavoriteRemoveResponse;
import ntk.base.api.news.model.NewsContentListRequest;
import ntk.base.api.news.model.NewsContentOtherInfoRequest;
import ntk.base.api.news.model.NewsContentOtherInfoResponse;
import ntk.base.api.news.model.NewsContentSimilarListRequest;
import ntk.base.api.news.model.NewsContentViewRequest;
import ntk.base.api.news.model.NewsContentResponse;
import ntk.base.api.news.model.NewsTagRequest;
import ntk.base.api.news.model.NewsTagResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface INews {

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: NewsContentList"})
    Observable<NewsContentResponse> GetContentList(@HeaderMap Map<String, String> headers, @Body NewsContentListRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: NewsContentView"})
    Observable<NewsContentResponse> GetContentView(@HeaderMap Map<String, String> headers, @Body NewsContentViewRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: NewsTagList"})
    Observable<NewsTagResponse> GetTagList(@HeaderMap Map<String, String> headers, @Body NewsTagRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: NewsCategoryList"})
    Observable<NewsCategoryResponse> GetCategoryList(@HeaderMap Map<String, String> headers, @Body NewsCategoryRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: NewsCategoryTagList"})
    Observable<NewsCategoryTagResponse> GetCategoryTagList(@HeaderMap Map<String, String> headers, @Body NewsCategoryTagRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: NewsContentOtherInfoList"})
    Observable<NewsContentOtherInfoResponse> GetContentOtherInfoList(@HeaderMap Map<String, String> headers, @Body NewsContentOtherInfoRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: NewsCommentList"})
    Observable<NewsCommentResponse> GetCommentList(@HeaderMap Map<String, String> headers, @Body NewsCommentListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: NewsCommentAdd"})
    Observable<NewsCommentResponse> SetComment(@HeaderMap Map<String, String> headers, @Body NewsCommentAddRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: NewsCommentView"})
    Observable<NewsCommentResponse> GetCommentView(@HeaderMap Map<String, String> headers, @Body NewsCommentViewRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: NewsContentFavoriteAdd"})
    Observable<NewsContentFavoriteAddResponse> SetContentFavoriteAdd(@HeaderMap Map<String, String> headers, @Body NewsContentFavoriteAddRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: NewsContentFavoriteRemove"})
    Observable<NewsContentFavoriteRemoveResponse> SetContentFavoriteRemove(@HeaderMap Map<String, String> headers, @Body NewsContentFavoriteRemoveRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: NewsContentFavoriteList"})
    Observable<NewsContentFavoriteListResponse> GetContentFavoriteList(@HeaderMap Map<String, String> headers, @Body NewsContentFavoriteListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: NewsContentSimilarList"})
    Observable<NewsContentResponse> GetContentSimilarList(@HeaderMap Map<String, String> headers, @Body NewsContentSimilarListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: NewsContentCategoryList"})
    Observable<NewsContentResponse> GetContentCategoryList(@HeaderMap Map<String, String> headers, @Body NewsContentCategoryListRequest request);
}

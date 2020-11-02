package ntk.android.base.api.article.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.api.article.model.ArticleCategoryRequest;
import ntk.android.base.api.article.model.ArticleCategoryResponse;
import ntk.android.base.api.article.model.ArticleCategoryTagRequest;
import ntk.android.base.api.article.model.ArticleCategoryTagResponse;
import ntk.android.base.api.article.model.ArticleCommentAddRequest;
import ntk.android.base.api.article.model.ArticleCommentListRequest;
import ntk.android.base.api.article.model.ArticleCommentViewRequest;
import ntk.android.base.api.article.model.ArticleCommentResponse;
import ntk.android.base.api.article.model.ArticleContentCategoryListRequest;
import ntk.android.base.api.article.model.ArticleContentFavoriteAddRequest;
import ntk.android.base.api.article.model.ArticleContentFavoriteAddResponse;
import ntk.android.base.api.article.model.ArticleContentFavoriteListRequest;
import ntk.android.base.api.article.model.ArticleContentFavoriteListResponse;
import ntk.android.base.api.article.model.ArticleContentFavoriteRemoveRequest;
import ntk.android.base.api.article.model.ArticleContentFavoriteRemoveResponse;
import ntk.android.base.api.article.model.ArticleContentListRequest;
import ntk.android.base.api.article.model.ArticleContentOtherInfoRequest;
import ntk.android.base.api.article.model.ArticleContentOtherInfoResponse;
import ntk.android.base.api.article.model.ArticleContentSimilarListRequest;
import ntk.android.base.api.article.model.ArticleContentViewRequest;
import ntk.android.base.api.article.model.ArticleContentResponse;
import ntk.android.base.api.article.model.ArticleTagRequest;
import ntk.android.base.api.article.model.ArticleTagResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IArticle {

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ArticleContentActList"})
    Observable<ArticleContentResponse> GetContentList(@HeaderMap Map<String, String> headers, @Body ArticleContentListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ArticleContentActView"})
    Observable<ArticleContentResponse> GetContentView(@HeaderMap Map<String, String> headers, @Body ArticleContentViewRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ArticleTagActList"})
    Observable<ArticleTagResponse> GetTagList(@HeaderMap Map<String, String> headers, @Body ArticleTagRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: ArticleCategoryActList"})
    Observable<ArticleCategoryResponse> GetCategoryList(@HeaderMap Map<String, String> headers, @Body ArticleCategoryRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: ArticleCategoryTagActList"})
    Observable<ArticleCategoryTagResponse> GetCategoryTagList(@HeaderMap Map<String, String> headers, @Body ArticleCategoryTagRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: ArticleContentOtherInfoActList"})
    Observable<ArticleContentOtherInfoResponse> GetContentOtherInfoList(@HeaderMap Map<String, String> headers, @Body ArticleContentOtherInfoRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: ArticleCommentActList"})
    Observable<ArticleCommentResponse> GetCommentList(@HeaderMap Map<String, String> headers, @Body ArticleCommentListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: ArticleCommentActAdd"})
    Observable<ArticleCommentResponse> SetComment(@HeaderMap Map<String, String> headers, @Body ArticleCommentAddRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: ArticleCommentActView"})
    Observable<ArticleCommentResponse> GetCommentView(@HeaderMap Map<String, String> headers, @Body ArticleCommentViewRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: ArticleContentFavoriteActAdd"})
    Observable<ArticleContentFavoriteAddResponse> SetContentFavoriteAdd(@HeaderMap Map<String, String> headers, @Body ArticleContentFavoriteAddRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: ArticleContentFavoriteActRemove"})
    Observable<ArticleContentFavoriteRemoveResponse> SetContentFavoriteRemove(@HeaderMap Map<String, String> headers, @Body ArticleContentFavoriteRemoveRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: ArticleContentFavoriteActList"})
    Observable<ArticleContentFavoriteListResponse> GetContentFavoriteList(@HeaderMap Map<String, String> headers, @Body ArticleContentFavoriteListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ArticleContentSimilarActList"})
    Observable<ArticleContentResponse> GetContentSimilarList(@HeaderMap Map<String, String> headers , @Body ArticleContentSimilarListRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ArticleContentCategoryActList"})
    Observable<ArticleContentResponse> GetContentCategoryList(@HeaderMap Map<String, String> headers  , @Body ArticleContentCategoryListRequest request);
}

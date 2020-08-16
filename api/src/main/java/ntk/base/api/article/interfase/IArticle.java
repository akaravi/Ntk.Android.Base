package ntk.base.api.article.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.article.model.ArticleCategoryRequest;
import ntk.base.api.article.model.ArticleCategoryResponse;
import ntk.base.api.article.model.ArticleCategoryTagRequest;
import ntk.base.api.article.model.ArticleCategoryTagResponse;
import ntk.base.api.article.model.ArticleCommentAddRequest;
import ntk.base.api.article.model.ArticleCommentListRequest;
import ntk.base.api.article.model.ArticleCommentViewRequest;
import ntk.base.api.article.model.ArticleCommentResponse;
import ntk.base.api.article.model.ArticleContentCategoryListRequest;
import ntk.base.api.article.model.ArticleContentFavoriteAddRequest;
import ntk.base.api.article.model.ArticleContentFavoriteAddResponse;
import ntk.base.api.article.model.ArticleContentFavoriteListRequest;
import ntk.base.api.article.model.ArticleContentFavoriteListResponse;
import ntk.base.api.article.model.ArticleContentFavoriteRemoveRequest;
import ntk.base.api.article.model.ArticleContentFavoriteRemoveResponse;
import ntk.base.api.article.model.ArticleContentListRequest;
import ntk.base.api.article.model.ArticleContentOtherInfoRequest;
import ntk.base.api.article.model.ArticleContentOtherInfoResponse;
import ntk.base.api.article.model.ArticleContentSimilarListRequest;
import ntk.base.api.article.model.ArticleContentViewRequest;
import ntk.base.api.article.model.ArticleContentResponse;
import ntk.base.api.article.model.ArticleTagRequest;
import ntk.base.api.article.model.ArticleTagResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IArticle {

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ArticleContentList"})
    Observable<ArticleContentResponse> GetContentList(@HeaderMap Map<String, String> headers, @Body ArticleContentListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ArticleContentView"})
    Observable<ArticleContentResponse> GetContentView(@HeaderMap Map<String, String> headers, @Body ArticleContentViewRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ArticleTagList"})
    Observable<ArticleTagResponse> GetTagList(@HeaderMap Map<String, String> headers, @Body ArticleTagRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: ArticleCategoryList"})
    Observable<ArticleCategoryResponse> GetCategoryList(@HeaderMap Map<String, String> headers, @Body ArticleCategoryRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: ArticleCategoryTagList"})
    Observable<ArticleCategoryTagResponse> GetCategoryTagList(@HeaderMap Map<String, String> headers, @Body ArticleCategoryTagRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: ArticleContentOtherInfoList"})
    Observable<ArticleContentOtherInfoResponse> GetContentOtherInfoList(@HeaderMap Map<String, String> headers, @Body ArticleContentOtherInfoRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: ArticleCommentList"})
    Observable<ArticleCommentResponse> GetCommentList(@HeaderMap Map<String, String> headers, @Body ArticleCommentListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: ArticleCommentAdd"})
    Observable<ArticleCommentResponse> SetComment(@HeaderMap Map<String, String> headers, @Body ArticleCommentAddRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: ArticleCommentView"})
    Observable<ArticleCommentResponse> GetCommentView(@HeaderMap Map<String, String> headers, @Body ArticleCommentViewRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: ArticleContentFavoriteAdd"})
    Observable<ArticleContentFavoriteAddResponse> SetContentFavoriteAdd(@HeaderMap Map<String, String> headers, @Body ArticleContentFavoriteAddRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: ArticleContentFavoriteRemove"})
    Observable<ArticleContentFavoriteRemoveResponse> SetContentFavoriteRemove(@HeaderMap Map<String, String> headers, @Body ArticleContentFavoriteRemoveRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json" , "layout: ArticleContentFavoriteList"})
    Observable<ArticleContentFavoriteListResponse> GetContentFavoriteList(@HeaderMap Map<String, String> headers, @Body ArticleContentFavoriteListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ArticleContentSimilarList"})
    Observable<ArticleContentResponse> GetContentSimilarList(@HeaderMap Map<String, String> headers , @Body ArticleContentSimilarListRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ArticleContentCategoryList"})
    Observable<ArticleContentResponse> GetContentCategoryList(@HeaderMap Map<String, String> headers  , @Body ArticleContentCategoryListRequest request);
}

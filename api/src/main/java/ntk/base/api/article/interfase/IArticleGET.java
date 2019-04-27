package ntk.base.api.article.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.article.model.ArticleCategoryTagResponse;
import ntk.base.api.article.model.ArticleContentResponse;
import ntk.base.api.article.model.ArticleTagResponse;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;

public interface IArticleGET {

    @GET("api/app/")
    @Headers({"content-type: application/json", "layout: ArticleContentList"})
    Observable<ArticleContentResponse> GetContentList(@HeaderMap Map<String, String> headers);

    @GET("api/app/")
    @Headers({"content-type: application/json" , "layout: ArticleCategoryTagList"})
    Observable<ArticleCategoryTagResponse> GetCategoryTagList(@HeaderMap Map<String, String> headers);

    @GET("api/app/")
    @Headers({"content-type: application/json", "layout: ArticleTagList"})
    Observable<ArticleTagResponse> GetTagList(@HeaderMap Map<String, String> headers);

    @GET("api/app/")
    @Headers({"content-type: application/json", "layout: ArticleContentSimilarList"})
    Observable<ArticleContentResponse> GetContentSimilarList(@HeaderMap Map<String, String> headers);


    @GET("api/app/")
    @Headers({"content-type: application/json", "layout: ArticleContentCategoryList"})
    Observable<ArticleContentResponse> GetContentCategoryList(@HeaderMap Map<String, String> headers);
}

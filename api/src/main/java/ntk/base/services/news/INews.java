package ntk.base.services.news;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.news.model.NewsCategoryRequest;
import ntk.base.api.news.model.NewsCategoryResponse;
import ntk.base.api.news.model.NewsCategoryTagRequest;
import ntk.base.api.news.model.NewsCategoryTagResponse;
import ntk.base.api.news.model.NewsCommentAddRequest;
import ntk.base.api.news.model.NewsCommentListRequest;
import ntk.base.api.news.model.NewsCommentResponse;
import ntk.base.api.news.model.NewsCommentViewRequest;
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
import ntk.base.api.news.model.NewsContentResponse;
import ntk.base.api.news.model.NewsContentSimilarListRequest;
import ntk.base.api.news.model.NewsContentViewRequest;
import ntk.base.api.news.model.NewsTagRequest;
import ntk.base.api.news.model.NewsTagResponse;
import ntk.base.services.base.ICmsApiServerBase;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface INews extends ICmsApiServerBase {


}

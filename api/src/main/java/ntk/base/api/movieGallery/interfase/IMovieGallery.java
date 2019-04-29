package ntk.base.api.movieGallery.interfase;

import android.database.Observable;

import java.util.Map;

import ntk.base.api.movieGallery.model.MovieGalleryCategoryRequest;
import ntk.base.api.movieGallery.model.MovieGalleryCategoryResponse;
import ntk.base.api.movieGallery.model.MovieGalleryCategoryTagRequest;
import ntk.base.api.movieGallery.model.MovieGalleryCategoryTagResponse;
import ntk.base.api.movieGallery.model.MovieGalleryCommentAddRequest;
import ntk.base.api.movieGallery.model.MovieGalleryCommentListRequest;
import ntk.base.api.movieGallery.model.MovieGalleryCommentResponse;
import ntk.base.api.movieGallery.model.MovieGalleryCommentViewRequest;
import ntk.base.api.movieGallery.model.MovieGalleryContentCategoryListRequest;
import ntk.base.api.movieGallery.model.MovieGalleryContentFavoriteAddRequest;
import ntk.base.api.movieGallery.model.MovieGalleryContentFavoriteAddResponse;
import ntk.base.api.movieGallery.model.MovieGalleryContentFavoriteListRequest;
import ntk.base.api.movieGallery.model.MovieGalleryContentFavoriteListResponse;
import ntk.base.api.movieGallery.model.MovieGalleryContentFavoriteRemoveRequest;
import ntk.base.api.movieGallery.model.MovieGalleryContentFavoriteRemoveResponse;
import ntk.base.api.movieGallery.model.MovieGalleryContentListRequest;
import ntk.base.api.movieGallery.model.MovieGalleryContentOtherInfoRequest;
import ntk.base.api.movieGallery.model.MovieGalleryContentOtherInfoResponse;
import ntk.base.api.movieGallery.model.MovieGalleryContentResponse;
import ntk.base.api.movieGallery.model.MovieGalleryContentSimilarListRequest;
import ntk.base.api.movieGallery.model.MovieGalleryContentViewRequest;
import ntk.base.api.movieGallery.model.MovieGalleryTagRequest;
import ntk.base.api.movieGallery.model.MovieGalleryTagResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IMovieGallery {

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout : MovieGalleryCategoryList"})
    Observable<MovieGalleryCategoryResponse> GetCategoryList(@HeaderMap Map<String, String> headers, @Body MovieGalleryCategoryRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout : MovieGalleryCategoryTagList"})
    Observable<MovieGalleryCategoryTagResponse> GetCategoryTagList(@HeaderMap Map<String, String> headers, @Body MovieGalleryCategoryTagRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: MovieGalleryCommentAdd"})
    Observable<MovieGalleryCommentResponse> SetComment(@HeaderMap Map<String, String> headers, @Body MovieGalleryCommentAddRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: MovieGalleryCommentList"})
    Observable<MovieGalleryCommentResponse> GetCommentList(@HeaderMap Map<String, String> headers, @Body MovieGalleryCommentListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: MovieGalleryCommentView"})
    Observable<MovieGalleryCommentResponse> GetCommentView(@HeaderMap Map<String, String> headers, @Body MovieGalleryCommentViewRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: MovieGalleryContentCategoryList"})
    Observable<MovieGalleryContentResponse> GetContentCategoryList(@HeaderMap Map<String, String> headers, @Body MovieGalleryContentCategoryListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: MovieGalleryContentFavoriteAdd"})
    Observable<MovieGalleryContentFavoriteAddResponse> SetContentFavoriteAdd(@HeaderMap Map<String, String> headers, @Body MovieGalleryContentFavoriteAddRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: MovieGalleryContentFavoriteList"})
    Observable<MovieGalleryContentFavoriteListResponse> GetContentFavoriteList(@HeaderMap Map<String, String> headers, @Body MovieGalleryContentFavoriteListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: MovieGalleryContentFavoriteRemove"})
    Observable<MovieGalleryContentFavoriteRemoveResponse> SetContentFavoriteRemove(@HeaderMap Map<String, String> headers, @Body MovieGalleryContentFavoriteRemoveRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: MovieGalleryContentList"})
    Observable<MovieGalleryContentResponse> GetContentList(@HeaderMap Map<String, String> headers, @Body MovieGalleryContentListRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: MovieGalleryContentOtherInfoList"})
    Observable<MovieGalleryContentOtherInfoRequest> GetContentOtherInfoList(@HeaderMap Map<String, String> headers, @Body MovieGalleryContentOtherInfoResponse request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: MovieGalleryContentSimilarList"})
    Observable<MovieGalleryContentResponse> GetContentSimilarList(@HeaderMap Map<String, String> headers, @Body MovieGalleryContentSimilarListRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: MovieGalleryContentView"})
    Observable<MovieGalleryContentResponse> GetContentView(@HeaderMap Map<String, String> headers, @Body MovieGalleryContentViewRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout : MovieGalleryTagList"})
    Observable<MovieGalleryTagResponse> GetTagList(@HeaderMap Map<String, String> headers, @Body MovieGalleryTagRequest request);

}

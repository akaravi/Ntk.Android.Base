package ntk.base.api.imageGallery.interfase;

import io.reactivex.Observable;

import java.util.Map;

import ntk.base.api.imageGallery.model.ImageGalleryCategoryRequest;
import ntk.base.api.imageGallery.model.ImageGalleryCategoryResponse;
import ntk.base.api.imageGallery.model.ImageGalleryCategoryTagRequest;
import ntk.base.api.imageGallery.model.ImageGalleryCategoryTagResponse;
import ntk.base.api.imageGallery.model.ImageGalleryCommentAddRequest;
import ntk.base.api.imageGallery.model.ImageGalleryCommentListRequest;
import ntk.base.api.imageGallery.model.ImageGalleryCommentResponse;
import ntk.base.api.imageGallery.model.ImageGalleryCommentViewRequest;
import ntk.base.api.imageGallery.model.ImageGalleryContentCategoryListRequest;
import ntk.base.api.imageGallery.model.ImageGalleryContentFavoriteAddRequest;
import ntk.base.api.imageGallery.model.ImageGalleryContentFavoriteAddResponse;
import ntk.base.api.imageGallery.model.ImageGalleryContentFavoriteListRequest;
import ntk.base.api.imageGallery.model.ImageGalleryContentFavoriteListResponse;
import ntk.base.api.imageGallery.model.ImageGalleryContentFavoriteRemoveRequest;
import ntk.base.api.imageGallery.model.ImageGalleryContentFavoriteRemoveResponse;
import ntk.base.api.imageGallery.model.ImageGalleryContentListRequest;
import ntk.base.api.imageGallery.model.ImageGalleryContentOtherInfoRequest;
import ntk.base.api.imageGallery.model.ImageGalleryContentOtherInfoResponse;
import ntk.base.api.imageGallery.model.ImageGalleryContentResponse;
import ntk.base.api.imageGallery.model.ImageGalleryContentSimilarListRequest;
import ntk.base.api.imageGallery.model.ImageGalleryContentViewRequest;
import ntk.base.api.imageGallery.model.ImageGalleryTagRequest;
import ntk.base.api.imageGallery.model.ImageGalleryTagResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IImageGallery {

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout : ImageGalleryCategoryList"})
    Observable<ImageGalleryCategoryResponse> GetCategoryList(@HeaderMap Map<String, String> headers, @Body ImageGalleryCategoryRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout : ImageGalleryCategoryTagList"})
    Observable<ImageGalleryCategoryTagResponse> GetCategoryTagList(@HeaderMap Map<String, String> headers, @Body ImageGalleryCategoryTagRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ImageGalleryCommentAdd"})
    Observable<ImageGalleryCommentResponse> SetComment(@HeaderMap Map<String, String> headers, @Body ImageGalleryCommentAddRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ImageGalleryCommentList"})
    Observable<ImageGalleryCommentResponse> GetCommentList(@HeaderMap Map<String, String> headers, @Body ImageGalleryCommentListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ImageGalleryCommentView"})
    Observable<ImageGalleryCommentResponse> GetCommentView(@HeaderMap Map<String, String> headers, @Body ImageGalleryCommentViewRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ImageGalleryContentCategoryList"})
    Observable<ImageGalleryContentResponse> GetContentCategoryList(@HeaderMap Map<String, String> headers, @Body ImageGalleryContentCategoryListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ImageGalleryContentFavoriteAdd"})
    Observable<ImageGalleryContentFavoriteAddResponse> SetContentFavoriteAdd(@HeaderMap Map<String, String> headers, @Body ImageGalleryContentFavoriteAddRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ImageGalleryContentFavoriteList"})
    Observable<ImageGalleryContentFavoriteListResponse> GetContentFavoriteList(@HeaderMap Map<String, String> headers, @Body ImageGalleryContentFavoriteListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ImageGalleryContentFavoriteRemove"})
    Observable<ImageGalleryContentFavoriteRemoveResponse> SetContentFavoriteRemove(@HeaderMap Map<String, String> headers, @Body ImageGalleryContentFavoriteRemoveRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ImageGalleryContentList"})
    Observable<ImageGalleryContentResponse> GetContentList(@HeaderMap Map<String, String> headers, @Body ImageGalleryContentListRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ImageGalleryContentOtherInfoList"})
    Observable<ImageGalleryContentOtherInfoResponse> GetContentOtherInfoList(@HeaderMap Map<String, String> headers, @Body ImageGalleryContentOtherInfoRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: ImageGalleryContentSimilarList"})
    Observable<ImageGalleryContentResponse> GetContentSimilarList(@HeaderMap Map<String, String> headers, @Body ImageGalleryContentSimilarListRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ImageGalleryContentView"})
    Observable<ImageGalleryContentResponse> GetContentView(@HeaderMap Map<String, String> headers, @Body ImageGalleryContentViewRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout : ImageGalleryTagList"})
    Observable<ImageGalleryTagResponse> GetTagList(@HeaderMap Map<String, String> headers, @Body ImageGalleryTagRequest request);
}

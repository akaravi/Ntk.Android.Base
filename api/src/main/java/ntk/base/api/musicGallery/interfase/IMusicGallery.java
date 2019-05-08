package ntk.base.api.musicGallery.interfase;

import io.reactivex.Observable;

import java.util.Map;

import ntk.base.api.musicGallery.model.MusicGalleryCategoryRequest;
import ntk.base.api.musicGallery.model.MusicGalleryCategoryResponse;
import ntk.base.api.musicGallery.model.MusicGalleryCategoryTagRequest;
import ntk.base.api.musicGallery.model.MusicGalleryCategoryTagResponse;
import ntk.base.api.musicGallery.model.MusicGalleryCommentAddRequest;
import ntk.base.api.musicGallery.model.MusicGalleryCommentListRequest;
import ntk.base.api.musicGallery.model.MusicGalleryCommentResponse;
import ntk.base.api.musicGallery.model.MusicGalleryCommentViewRequest;
import ntk.base.api.musicGallery.model.MusicGalleryContentCategoryListRequest;
import ntk.base.api.musicGallery.model.MusicGalleryContentFavoriteAddRequest;
import ntk.base.api.musicGallery.model.MusicGalleryContentFavoriteAddResponse;
import ntk.base.api.musicGallery.model.MusicGalleryContentFavoriteListRequest;
import ntk.base.api.musicGallery.model.MusicGalleryContentFavoriteListResponse;
import ntk.base.api.musicGallery.model.MusicGalleryContentFavoriteRemoveRequest;
import ntk.base.api.musicGallery.model.MusicGalleryContentFavoriteRemoveResponse;
import ntk.base.api.musicGallery.model.MusicGalleryContentListRequest;
import ntk.base.api.musicGallery.model.MusicGalleryContentOtherInfoRequest;
import ntk.base.api.musicGallery.model.MusicGalleryContentOtherInfoResponse;
import ntk.base.api.musicGallery.model.MusicGalleryContentResponse;
import ntk.base.api.musicGallery.model.MusicGalleryContentSimilarListRequest;
import ntk.base.api.musicGallery.model.MusicGalleryContentViewRequest;
import ntk.base.api.musicGallery.model.MusicGalleryTagRequest;
import ntk.base.api.musicGallery.model.MusicGalleryTagResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IMusicGallery {

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: MusicGalleryCategoryList"})
    Observable<MusicGalleryCategoryResponse> GetCategoryList(@HeaderMap Map<String, String> headers, @Body MusicGalleryCategoryRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: MusicGalleryCategoryTagList"})
    Observable<MusicGalleryCategoryTagResponse> GetCategoryTagList(@HeaderMap Map<String, String> headers, @Body MusicGalleryCategoryTagRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: MusicGalleryCommentAdd"})
    Observable<MusicGalleryCommentResponse> SetComment(@HeaderMap Map<String, String> headers, @Body MusicGalleryCommentAddRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: MusicGalleryCommentList"})
    Observable<MusicGalleryCommentResponse> GetCommentList(@HeaderMap Map<String, String> headers, @Body MusicGalleryCommentListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: MusicGalleryCommentView"})
    Observable<MusicGalleryCommentResponse> GetCommentView(@HeaderMap Map<String, String> headers, @Body MusicGalleryCommentViewRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: MusicGalleryContentCategoryList"})
    Observable<MusicGalleryContentResponse> GetContentCategoryList(@HeaderMap Map<String, String> headers, @Body MusicGalleryContentCategoryListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: MusicGalleryContentFavoriteAdd"})
    Observable<MusicGalleryContentFavoriteAddResponse> SetContentFavoriteAdd(@HeaderMap Map<String, String> headers, @Body MusicGalleryContentFavoriteAddRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: MusicGalleryContentFavoriteList"})
    Observable<MusicGalleryContentFavoriteListResponse> GetContentFavoriteList(@HeaderMap Map<String, String> headers, @Body MusicGalleryContentFavoriteListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: MusicGalleryContentFavoriteRemove"})
    Observable<MusicGalleryContentFavoriteRemoveResponse> SetContentFavoriteRemove(@HeaderMap Map<String, String> headers, @Body MusicGalleryContentFavoriteRemoveRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: MusicGalleryContentList"})
    Observable<MusicGalleryContentResponse> GetContentList(@HeaderMap Map<String, String> headers, @Body MusicGalleryContentListRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: MusicGalleryContentOtherInfoList"})
    Observable<MusicGalleryContentOtherInfoResponse> GetContentOtherInfoList(@HeaderMap Map<String, String> headers, @Body MusicGalleryContentOtherInfoRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: MusicGalleryContentSimilarList"})
    Observable<MusicGalleryContentResponse> GetContentSimilarList(@HeaderMap Map<String, String> headers, @Body MusicGalleryContentSimilarListRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: MusicGalleryContentView"})
    Observable<MusicGalleryContentResponse> GetContentView(@HeaderMap Map<String, String> headers, @Body MusicGalleryContentViewRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout : MusicGalleryTagList"})
    Observable<MusicGalleryTagResponse> GetTagList(@HeaderMap Map<String, String> headers, @Body MusicGalleryTagRequest request);
}

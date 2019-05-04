package ntk.base.api.biography.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.biography.model.BiographyCategoryRequest;
import ntk.base.api.biography.model.BiographyCategoryResponse;
import ntk.base.api.biography.model.BiographyCategoryTagRequest;
import ntk.base.api.biography.model.BiographyCategoryTagResponse;
import ntk.base.api.biography.model.BiographyCommentAddRequest;
import ntk.base.api.biography.model.BiographyCommentListRequest;
import ntk.base.api.biography.model.BiographyCommentViewRequest;
import ntk.base.api.biography.model.BiographyCommentResponse;
import ntk.base.api.biography.model.BiographyContentCategoryListRequest;
import ntk.base.api.biography.model.BiographyContentFavoriteAddRequest;
import ntk.base.api.biography.model.BiographyContentFavoriteAddResponse;
import ntk.base.api.biography.model.BiographyContentFavoriteListRequest;
import ntk.base.api.biography.model.BiographyContentFavoriteListResponse;
import ntk.base.api.biography.model.BiographyContentFavoriteRemoveRequest;
import ntk.base.api.biography.model.BiographyContentFavoriteRemoveResponse;
import ntk.base.api.biography.model.BiographyContentListRequest;
import ntk.base.api.biography.model.BiographyContentOtherInfoRequest;
import ntk.base.api.biography.model.BiographyContentOtherInfoResponse;
import ntk.base.api.biography.model.BiographyContentSimilarListRequest;
import ntk.base.api.biography.model.BiographyContentViewRequest;
import ntk.base.api.biography.model.BiographyContentResponse;
import ntk.base.api.biography.model.BiographyContentWithDatePeriodEndListRequest;
import ntk.base.api.biography.model.BiographyContentWithDatePeriodStartListRequest;
import ntk.base.api.biography.model.BiographyContentWithSimilarDatePeriodEndListRequest;
import ntk.base.api.biography.model.BiographyContentWithSimilarDatePeriodStartDayAndMonthOfYearListRequest;
import ntk.base.api.biography.model.BiographyContentWithSimilarDatePeriodStartDayOfYearListRequest;
import ntk.base.api.biography.model.BiographyContentWithSimilarDatePeriodStartListRequest;
import ntk.base.api.biography.model.BiographyContentWithSimilarDatePeriodStartMonthOfYearListRequest;
import ntk.base.api.biography.model.BiographyTagRequest;
import ntk.base.api.biography.model.BiographyTagResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IBiography {

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: biographyContentList"})
    Observable<BiographyContentResponse> GetContentList(@HeaderMap Map<String, String> headers, @Body BiographyContentListRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: biographyContentView"})
    Observable<BiographyContentResponse> GetContentView(@HeaderMap Map<String, String> headers, @Body BiographyContentViewRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: biographyTagList"})
    Observable<BiographyTagResponse> GetTagList(@HeaderMap Map<String, String> headers, @Body BiographyTagRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: biographyCategoryList"})
    Observable<BiographyCategoryResponse> GetCategoryList(@HeaderMap Map<String, String> headers, @Body BiographyCategoryRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: biographyCategoryTagList"})
    Observable<BiographyCategoryTagResponse> GetCategoryTagList(@HeaderMap Map<String, String> headers, @Body BiographyCategoryTagRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: biographyContentOtherInfoList"})
    Observable<BiographyContentOtherInfoResponse> GetContentOtherInfoList(@HeaderMap Map<String, String> headers, @Body BiographyContentOtherInfoRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: biographyCommentList"})
    Observable<BiographyCommentResponse> GetCommentList(@HeaderMap Map<String, String> headers, @Body BiographyCommentListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: BiographyCommentAdd"})
    Observable<BiographyCommentResponse> SetComment(@HeaderMap Map<String, String> headers, @Body BiographyCommentAddRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: biographyCommentView"})
    Observable<BiographyCommentResponse> GetCommentView(@HeaderMap Map<String, String> headers, @Body BiographyCommentViewRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: biographyContentFavoriteAdd"})
    Observable<BiographyContentFavoriteAddResponse> SetContentFavoriteAdd(@HeaderMap Map<String, String> headers, @Body BiographyContentFavoriteAddRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: biographyContentFavoriteRemove"})
    Observable<BiographyContentFavoriteRemoveResponse> SetContentFavoriteRemove(@HeaderMap Map<String, String> headers, @Body BiographyContentFavoriteRemoveRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: biographyContentFavoriteList"})
    Observable<BiographyContentFavoriteListResponse> GetContentFavoriteList(@HeaderMap Map<String, String> headers, @Body BiographyContentFavoriteListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: BiographyContentCategoryList"})
    Observable<BiographyContentResponse> GetContentCategoryList(@HeaderMap Map<String, String> headers, @Body BiographyContentCategoryListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: BiographyContentSimilarList"})
    Observable<BiographyContentResponse> GetContentSimilarList(@HeaderMap Map<String, String> headers, @Body BiographyContentSimilarListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: BiographyContentWithDatePeriodEndList"})
    Observable<BiographyContentResponse> GetContentWithDatePeriodEndList(@HeaderMap Map<String, String> headers, @Body BiographyContentWithDatePeriodEndListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: BiographyContentWithDatePeriodStartList"})
    Observable<BiographyContentResponse> GetContentWithDatePeriodStartList(@HeaderMap Map<String, String> headers, @Body BiographyContentWithDatePeriodStartListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: BiographyContentWithSimilarDatePeriodEndList"})
    Observable<BiographyContentResponse> GetContentWithSimilarDatePeriodEndList(@HeaderMap Map<String, String> headers, @Body BiographyContentWithSimilarDatePeriodEndListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: BiographyContentWithSimilarDatePeriodStartDayAndMonthOfYearList"})
    Observable<BiographyContentResponse> GetContentWithSimilarDatePeriodStartDayAndMonthOfYearList(@HeaderMap Map<String, String> headers, @Body BiographyContentWithSimilarDatePeriodStartDayAndMonthOfYearListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: BiographyContentWithSimilarDatePeriodStartDayOfYearList"})
    Observable<BiographyContentResponse> GetContentWithSimilarDatePeriodStartDayOfYearList(@HeaderMap Map<String, String> headers, @Body BiographyContentWithSimilarDatePeriodStartDayOfYearListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: BiographyContentWithSimilarDatePeriodStartList"})
    Observable<BiographyContentResponse> GetContentWithSimilarDatePeriodStartList(@HeaderMap Map<String, String> headers, @Body BiographyContentWithSimilarDatePeriodStartListRequest request);

    @POST("api/app")
    @Headers({"content-type: application/json", "layout: BiographyContentWithSimilarDatePeriodStartMonthOfYearList"})
    Observable<BiographyContentResponse> GetContentWithSimilarDatePeriodStartMonthOfYearList(@HeaderMap Map<String, String> headers, @Body BiographyContentWithSimilarDatePeriodStartMonthOfYearListRequest request);
}

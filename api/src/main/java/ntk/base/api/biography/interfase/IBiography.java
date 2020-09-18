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
import ntk.base.api.biography.model.BiographyContentWithSimilarLocationPeriodEndRequest;
import ntk.base.api.biography.model.BiographyContentWithSimilarLocationPeriodStartRequest;
import ntk.base.api.biography.model.BiographyContentWithSimilarLocationResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IBiography {

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: biographyContentActList"})
    Observable<BiographyContentResponse> GetContentList(@HeaderMap Map<String, String> headers, @Body BiographyContentListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: biographyContentActView"})
    Observable<BiographyContentResponse> GetContentView(@HeaderMap Map<String, String> headers, @Body BiographyContentViewRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: biographyTagActList"})
    Observable<BiographyTagResponse> GetTagList(@HeaderMap Map<String, String> headers, @Body BiographyTagRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: biographyCategoryActList"})
    Observable<BiographyCategoryResponse> GetCategoryList(@HeaderMap Map<String, String> headers, @Body BiographyCategoryRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: biographyCategoryTagActList"})
    Observable<BiographyCategoryTagResponse> GetCategoryTagList(@HeaderMap Map<String, String> headers, @Body BiographyCategoryTagRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: biographyContentOtherInfoActList"})
    Observable<BiographyContentOtherInfoResponse> GetContentOtherInfoList(@HeaderMap Map<String, String> headers, @Body BiographyContentOtherInfoRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: biographyCommentActList"})
    Observable<BiographyCommentResponse> GetCommentList(@HeaderMap Map<String, String> headers, @Body BiographyCommentListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BiographyCommentActActAdd"})
    Observable<BiographyCommentResponse> SetComment(@HeaderMap Map<String, String> headers, @Body BiographyCommentAddRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: biographyCommentActView"})
    Observable<BiographyCommentResponse> GetCommentView(@HeaderMap Map<String, String> headers, @Body BiographyCommentViewRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: biographyContentFavoriteActAdd"})
    Observable<BiographyContentFavoriteAddResponse> SetContentFavoriteAdd(@HeaderMap Map<String, String> headers, @Body BiographyContentFavoriteAddRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: biographyContentFavoriteActRemove"})
    Observable<BiographyContentFavoriteRemoveResponse> SetContentFavoriteRemove(@HeaderMap Map<String, String> headers, @Body BiographyContentFavoriteRemoveRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: biographyContentFavoriteActList"})
    Observable<BiographyContentFavoriteListResponse> GetContentFavoriteList(@HeaderMap Map<String, String> headers, @Body BiographyContentFavoriteListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BiographyContentCategoryActList"})
    Observable<BiographyContentResponse> GetContentCategoryList(@HeaderMap Map<String, String> headers, @Body BiographyContentCategoryListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BiographyContentSimilarActList"})
    Observable<BiographyContentResponse> GetContentSimilarList(@HeaderMap Map<String, String> headers, @Body BiographyContentSimilarListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BiographyContentActWithDatePeriodEndList"})
    Observable<BiographyContentResponse> GetContentWithDatePeriodEndList(@HeaderMap Map<String, String> headers, @Body BiographyContentWithDatePeriodEndListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BiographyContentActWithDatePeriodStartList"})
    Observable<BiographyContentResponse> GetContentWithDatePeriodStartList(@HeaderMap Map<String, String> headers, @Body BiographyContentWithDatePeriodStartListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BiographyContentActWithSimilarDatePeriodEndList"})
    Observable<BiographyContentResponse> GetContentWithSimilarDatePeriodEndList(@HeaderMap Map<String, String> headers, @Body BiographyContentWithSimilarDatePeriodEndListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BiographyContentActWithSimilarDatePeriodStartDayAndMonthOfYearList"})
    Observable<BiographyContentResponse> GetContentWithSimilarDatePeriodStartDayAndMonthOfYearList(@HeaderMap Map<String, String> headers, @Body BiographyContentWithSimilarDatePeriodStartDayAndMonthOfYearListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BiographyContentActWithSimilarDatePeriodStartDayOfYearList"})
    Observable<BiographyContentResponse> GetContentWithSimilarDatePeriodStartDayOfYearList(@HeaderMap Map<String, String> headers, @Body BiographyContentWithSimilarDatePeriodStartDayOfYearListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BiographyContentActWithSimilarDatePeriodStartList"})
    Observable<BiographyContentResponse> GetContentWithSimilarDatePeriodStartList(@HeaderMap Map<String, String> headers, @Body BiographyContentWithSimilarDatePeriodStartListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BiographyContentActWithSimilarDatePeriodStartMonthOfYearList"})
    Observable<BiographyContentResponse> GetContentWithSimilarDatePeriodStartMonthOfYearList(@HeaderMap Map<String, String> headers, @Body BiographyContentWithSimilarDatePeriodStartMonthOfYearListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BiographyContentActWithSimilarLocationPeriodStart"})
    Observable<BiographyContentWithSimilarLocationResponse> GetContentWithSimilarLocationPeriodStart(@HeaderMap Map<String, String> headers, @Body BiographyContentWithSimilarLocationPeriodStartRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: BiographyContentActWithSimilarLocationPeriodEnd"})
    Observable<BiographyContentWithSimilarLocationResponse> GetContentWithSimilarLocationPeriodEnd(@HeaderMap Map<String, String> headers, @Body BiographyContentWithSimilarLocationPeriodEndRequest request);
}

package ntk.android.base.services.biography;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.dtomodel.biography.BiographyContentWithDatePeriodEndDtoModel;
import ntk.android.base.dtomodel.biography.BiographyContentWithSimilarDatePeriodStartDayAndMonthOfYearDtoModel;
import ntk.android.base.dtomodel.biography.BiographyContentWithSimilarDatePeriodStartDayOfYearDtoModel;
import ntk.android.base.dtomodel.biography.BiographyContentWithSimilarDatePeriodStartDtoModel;
import ntk.android.base.dtomodel.biography.BiographyContentWithSimilarDatePeriodStartMonthOfYearListDtoModel;
import ntk.android.base.dtomodel.biography.BiographyContentWithSimilarLocationPeriodDtoModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.biography.BiographyContentModel;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

interface IBiographyContentService {

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<BiographyContentModel>> GetAllWithSimilarLocationPeriodStart(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body BiographyContentWithSimilarLocationPeriodDtoModel request);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<BiographyContentModel>> GetAllWithSimilarLocationPeriodEnd(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body BiographyContentWithSimilarLocationPeriodDtoModel request);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<BiographyContentModel>> GetAllWithSimilarDatePeriodStartMonthOfYear(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body BiographyContentWithSimilarDatePeriodStartMonthOfYearListDtoModel request);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<BiographyContentModel>> GetAllWithSimilarDatePeriodStart(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body BiographyContentWithSimilarDatePeriodStartDtoModel request);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<BiographyContentModel>> GetAllWithSimilarDatePeriodStartDayOfYear(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body BiographyContentWithSimilarDatePeriodStartDayOfYearDtoModel request);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<BiographyContentModel>> GetAllWithSimilarDatePeriodStartDayAndMonthOfYear(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body BiographyContentWithSimilarDatePeriodStartDayAndMonthOfYearDtoModel request);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<BiographyContentModel>> GetAllGetAllWithDatePeriodEnd(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body BiographyContentWithDatePeriodEndDtoModel request);



}

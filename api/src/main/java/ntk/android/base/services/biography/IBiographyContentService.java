package ntk.android.base.services.biography;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.dtomodel.biography.BiographyContentWithDatePeriodEndDtoModel;
import ntk.android.base.dtomodel.biography.BiographyContentWithSimilarDatePeriodStartDayAndMonthOfYearDtoModel;
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
    Observable<ErrorException<BiographyContentModel>> GetAllGetAllWithDatePeriodEnd(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body BiographyContentWithDatePeriodEndDtoModel request);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<BiographyContentModel>> GetAllWithSimilarDatePeriodStartDayAndMonthOfYear(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body BiographyContentWithSimilarDatePeriodStartDayAndMonthOfYearDtoModel request);

}

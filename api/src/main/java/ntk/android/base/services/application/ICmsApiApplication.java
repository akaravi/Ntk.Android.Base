package ntk.android.base.services.application;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.dtomodel.application.AboutUsDtoModel;
import ntk.android.base.dtomodel.application.ApplicationScoreDtoModel;
import ntk.android.base.dtomodel.application.MainResponseDtoModel;
import ntk.android.base.dtomodel.application.ThemeDtoModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

interface ICmsApiApplication {
    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    public Observable<ErrorExceptionBase> ScoreClick(@Path("cpath") String cpath, @HeaderMap Map<String, String> headers, @Body ApplicationScoreDtoModel request);

    //notice : this api moved from prev api implementation
    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: Theme"})
    Observable<ErrorException<ThemeDtoModel>> GetThemeCore(@HeaderMap Map<String, String> headers);

    //notice : this api moved from prev api implementation
    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: CoreAboutUs"})
    Observable<ErrorException<AboutUsDtoModel>> GetAbout(@HeaderMap Map<String, String> headers);

    //notice : this api moved from prev api implementation
    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: Main"})
    Observable<ErrorException<MainResponseDtoModel>> GetResponseMain(@HeaderMap Map<String, String> headers);
}

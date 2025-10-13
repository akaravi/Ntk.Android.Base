package ntk.android.base.services.application;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.entitymodel.application.ApplicationThemeConfigModel;
import ntk.android.base.entitymodel.base.ErrorException;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface IApplicationTheme {
    //
    @GET("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<ApplicationThemeConfigModel>> GetThemeCore(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers);

}

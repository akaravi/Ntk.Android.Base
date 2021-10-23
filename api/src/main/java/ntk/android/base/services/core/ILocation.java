package ntk.android.base.services.core;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.dtomodel.core.TokenDeviceClientInfoDtoModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.FilterModel;
import ntk.android.base.entitymodel.base.TokenInfoModel;
import ntk.android.base.entitymodel.core.CoreLocationModel;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

interface ILocation {
    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<CoreLocationModel>> GetAllProvinces(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body FilterModel request);
    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<CoreLocationModel>> GetAllTree(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body FilterModel request);
    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<CoreLocationModel>> GetAllCities(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body FilterModel request);
    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<CoreLocationModel>> GetAllNeighbourhoods(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body FilterModel request);

}

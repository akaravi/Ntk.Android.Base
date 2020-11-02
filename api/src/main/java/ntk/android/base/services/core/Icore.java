package ntk.android.base.services.core;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.api.core.entity.TokenInfoModel;
import ntk.android.base.dtoModel.core.TokenDeviceClientInfoDtoModel;
import ntk.android.base.entityModel.base.ErrorException;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

interface Icore {

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<TokenInfoModel>> getTokenDevice(@Path("cpath") String cpath, @HeaderMap Map<String, String> headers, @Body TokenDeviceClientInfoDtoModel request);

}

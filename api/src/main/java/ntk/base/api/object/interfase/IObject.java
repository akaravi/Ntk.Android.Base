package ntk.base.api.object.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.object.model.ObjectGroupRequest;
import ntk.base.api.object.model.ObjectGroupResonse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IObject {
    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ObjectGroupList"})
    Observable<ObjectGroupResonse> GetObjectGroupList(@HeaderMap Map<String, String> headers, @Body ObjectGroupRequest request);



}

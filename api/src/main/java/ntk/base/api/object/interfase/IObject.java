package ntk.base.api.object.interfase;

import java.util.Map;
import io.reactivex.Observable;
import ntk.base.api.object.model.ObjectGroupRequest;
import ntk.base.api.object.model.ObjectGroupResonse;
import ntk.base.api.object.model.ObjectHistoryActAddRequest;
import ntk.base.api.object.model.ObjectHistoryActViewRequest;
import ntk.base.api.object.model.ObjectHistoryRequest;
import ntk.base.api.object.model.ObjectHistoryResonse;
import ntk.base.api.object.model.ObjectPropertyActAddRequest;
import ntk.base.api.object.model.ObjectPropertyActViewByJoinIdRequest;
import ntk.base.api.object.model.ObjectPropertyActViewRequest;
import ntk.base.api.object.model.ObjectPropertyDetailGroupRequest;
import ntk.base.api.object.model.ObjectPropertyDetailGroupResonse;
import ntk.base.api.object.model.ObjectPropertyDetailRequest;
import ntk.base.api.object.model.ObjectPropertyDetailResonse;
import ntk.base.api.object.model.ObjectPropertyDetailValueRequest;
import ntk.base.api.object.model.ObjectPropertyDetailValueResonse;
import ntk.base.api.object.model.ObjectPropertyRequest;
import ntk.base.api.object.model.ObjectPropertyResonse;
import ntk.base.api.object.model.ObjectPropertySiteRequest;
import ntk.base.api.object.model.ObjectPropertySiteResonse;
import ntk.base.api.object.model.ObjectPropertyTypeRequest;
import ntk.base.api.object.model.ObjectPropertyTypeResonse;
import ntk.base.api.object.model.ObjectUserGroupRequest;
import ntk.base.api.object.model.ObjectUserGroupResonse;
import ntk.base.api.object.model.ObjectUserRequest;
import ntk.base.api.object.model.ObjectUserResonse;
import ntk.base.api.object.model.ObjectUserSiteActAddeByJoinIdRequest;
import ntk.base.api.object.model.ObjectUserSiteRequest;
import ntk.base.api.object.model.ObjectUserSiteResonse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;


public interface IObject {
    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ObjectGroupActList"})
    Observable<ObjectGroupResonse> GetGroupActList(@HeaderMap Map<String, String> headers, @Body ObjectGroupRequest request);

    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ObjectHistoryActAdd"})
    Observable<ObjectHistoryResonse> GetHistoryActAdd(@HeaderMap Map<String, String> headers, @Body ObjectHistoryActAddRequest request);


    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ObjectHistoryActList"})
    Observable<ObjectHistoryResonse> GetHistoryActList(@HeaderMap Map<String, String> headers, @Body ObjectHistoryRequest request);


    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ObjectHistoryActView"})
    Observable<ObjectHistoryResonse> GetHistoryActView(@HeaderMap Map<String, String> headers, @Body ObjectHistoryActViewRequest request);


    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ObjectPropertyActAdd"})
    Observable<ObjectPropertyResonse> SetPropertyActAdd(@HeaderMap Map<String, String> headers, @Body ObjectPropertyActAddRequest request);


    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ObjectPropertyActList"})
    Observable<ObjectPropertyResonse> GetPropertyActList(@HeaderMap Map<String, String> headers, @Body ObjectPropertyRequest request);


    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ObjectPropertyActView"})
    Observable<ObjectPropertyResonse> GetPropertyActView(@HeaderMap Map<String, String> headers, @Body ObjectPropertyActViewRequest request);


    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ObjectPropertyActViewByJoinId"})
    Observable<ObjectPropertyResonse> GetPropertyActViewByJoinId(@HeaderMap Map<String, String> headers, @Body ObjectPropertyActViewByJoinIdRequest request);


    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ObjectPropertyDetailActList"})
    Observable<ObjectPropertyDetailResonse> GetPropertyDetailActList(@HeaderMap Map<String, String> headers, @Body ObjectPropertyDetailRequest request);


    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ObjectPropertyDetailGroupActList"})
    Observable<ObjectPropertyDetailGroupResonse> GePropertyDetailGroupActList(@HeaderMap Map<String, String> headers, @Body ObjectPropertyDetailGroupRequest request);


    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ObjectPropertyDetailValueActList"})
    Observable<ObjectPropertyDetailValueResonse> GetPropertyDetailValueActList(@HeaderMap Map<String, String> headers, @Body ObjectPropertyDetailValueRequest request);


    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ObjectPropertySiteActList"})
    Observable<ObjectPropertySiteResonse> GetPropertySiteActList(@HeaderMap Map<String, String> headers, @Body ObjectPropertySiteRequest request);


    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ObjectPropertyTypeActList"})
    Observable<ObjectPropertyTypeResonse> GetPropertyTypeActList(@HeaderMap Map<String, String> headers, @Body ObjectPropertyTypeRequest request);


    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ObjectUserActList"})
    Observable<ObjectUserResonse> GetUserActList(@HeaderMap Map<String, String> headers, @Body ObjectUserRequest request);


    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ObjectUserGroupActList"})
    Observable<ObjectUserGroupResonse> GetUserGroupActList(@HeaderMap Map<String, String> headers, @Body ObjectUserGroupRequest request);


    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ObjectUserSiteActAddeByJoinId"})
    Observable<ObjectUserSiteResonse> SetUserSiteActAddeByJoinId(@HeaderMap Map<String, String> headers, @Body ObjectUserSiteActAddeByJoinIdRequest request);


    @POST("api/app/")
    @Headers({"content-type: application/json", "layout: ObjectUserSiteActList"})
    Observable<ObjectUserSiteResonse> GetUserSiteActList(@HeaderMap Map<String, String> headers, @Body ObjectUserSiteRequest request);

}

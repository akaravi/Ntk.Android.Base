package ntk.base.api.object.interfase;

import java.util.Map;
import io.reactivex.Observable;
import ntk.base.api.object.model.ObjectGroupRequest;
import ntk.base.api.object.model.ObjectGroupResponse;
import ntk.base.api.object.model.ObjectHistoryActAddRequest;
import ntk.base.api.object.model.ObjectHistoryActViewRequest;
import ntk.base.api.object.model.ObjectHistoryRequest;
import ntk.base.api.object.model.ObjectHistoryResponse;
import ntk.base.api.object.model.ObjectPropertyActAddRequest;
import ntk.base.api.object.model.ObjectPropertyActViewByJoinIdRequest;
import ntk.base.api.object.model.ObjectPropertyActViewRequest;
import ntk.base.api.object.model.ObjectPropertyDetailGroupRequest;
import ntk.base.api.object.model.ObjectPropertyDetailGroupResponse;
import ntk.base.api.object.model.ObjectPropertyDetailRequest;
import ntk.base.api.object.model.ObjectPropertyDetailResponse;
import ntk.base.api.object.model.ObjectPropertyDetailValueRequest;
import ntk.base.api.object.model.ObjectPropertyDetailValueResponse;
import ntk.base.api.object.model.ObjectPropertyRequest;
import ntk.base.api.object.model.ObjectPropertyResponse;
import ntk.base.api.object.model.ObjectPropertySiteRequest;
import ntk.base.api.object.model.ObjectPropertySiteResponse;
import ntk.base.api.object.model.ObjectPropertyTypeRequest;
import ntk.base.api.object.model.ObjectPropertyTypeResponse;
import ntk.base.api.object.model.ObjectUserGroupRequest;
import ntk.base.api.object.model.ObjectUserGroupResponse;
import ntk.base.api.object.model.ObjectUserRequest;
import ntk.base.api.object.model.ObjectUserResponse;
import ntk.base.api.object.model.ObjectUserSiteActAddeByJoinIdRequest;
import ntk.base.api.object.model.ObjectUserSiteRequest;
import ntk.base.api.object.model.ObjectUserSiteResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;


public interface IObject {
    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ObjectGroupActList"})
    Observable<ObjectGroupResponse> GetGroupActList(@HeaderMap Map<String, String> headers, @Body ObjectGroupRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ObjectHistoryActAdd"})
    Observable<ObjectHistoryResponse> GetHistoryActAdd(@HeaderMap Map<String, String> headers, @Body ObjectHistoryActAddRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ObjectHistoryActList"})
    Observable<ObjectHistoryResponse> GetHistoryActList(@HeaderMap Map<String, String> headers, @Body ObjectHistoryRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ObjectHistoryActView"})
    Observable<ObjectHistoryResponse> GetHistoryActView(@HeaderMap Map<String, String> headers, @Body ObjectHistoryActViewRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ObjectPropertyActAdd"})
    Observable<ObjectPropertyResponse> SetPropertyActAdd(@HeaderMap Map<String, String> headers, @Body ObjectPropertyActAddRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ObjectPropertyActList"})
    Observable<ObjectPropertyResponse> GetPropertyActList(@HeaderMap Map<String, String> headers, @Body ObjectPropertyRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ObjectPropertyActView"})
    Observable<ObjectPropertyResponse> GetPropertyActView(@HeaderMap Map<String, String> headers, @Body ObjectPropertyActViewRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ObjectPropertyActViewByJoinId"})
    Observable<ObjectPropertyResponse> GetPropertyActViewByJoinId(@HeaderMap Map<String, String> headers, @Body ObjectPropertyActViewByJoinIdRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ObjectPropertyDetailActList"})
    Observable<ObjectPropertyDetailResponse> GetPropertyDetailActList(@HeaderMap Map<String, String> headers, @Body ObjectPropertyDetailRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ObjectPropertyDetailGroupActList"})
    Observable<ObjectPropertyDetailGroupResponse> GetPropertyDetailGroupActList(@HeaderMap Map<String, String> headers, @Body ObjectPropertyDetailGroupRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ObjectPropertyDetailValueActList"})
    Observable<ObjectPropertyDetailValueResponse> GetPropertyDetailValueActList(@HeaderMap Map<String, String> headers, @Body ObjectPropertyDetailValueRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ObjectPropertySiteActList"})
    Observable<ObjectPropertySiteResponse> GetPropertySiteActList(@HeaderMap Map<String, String> headers, @Body ObjectPropertySiteRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ObjectPropertyTypeActList"})
    Observable<ObjectPropertyTypeResponse> GetPropertyTypeActList(@HeaderMap Map<String, String> headers, @Body ObjectPropertyTypeRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ObjectUserActList"})
    Observable<ObjectUserResponse> GetUserActList(@HeaderMap Map<String, String> headers, @Body ObjectUserRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ObjectUserGroupActList"})
    Observable<ObjectUserGroupResponse> GetUserGroupActList(@HeaderMap Map<String, String> headers, @Body ObjectUserGroupRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ObjectUserSiteActAddeByJoinId"})
    Observable<ObjectUserSiteResponse> SetUserSiteActAddeByJoinId(@HeaderMap Map<String, String> headers, @Body ObjectUserSiteActAddeByJoinIdRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: ObjectUserSiteActList"})
    Observable<ObjectUserSiteResponse> GetUserSiteActList(@HeaderMap Map<String, String> headers, @Body ObjectUserSiteRequest request);

}

package ntk.android.base.api.member.interfase;

import java.util.Map;
import io.reactivex.Observable;
import ntk.android.base.api.member.model.MemberGroupRequest;
import ntk.android.base.api.member.model.MemberGroupResponse;
import ntk.android.base.api.member.model.MemberHistoryActAddRequest;
import ntk.android.base.api.member.model.MemberHistoryActViewRequest;
import ntk.android.base.api.member.model.MemberHistoryRequest;
import ntk.android.base.api.member.model.MemberHistoryResponse;
import ntk.android.base.api.member.model.MemberPropertyActAddRequest;
import ntk.android.base.api.member.model.MemberPropertyActViewByJoinIdRequest;
import ntk.android.base.api.member.model.MemberPropertyActViewRequest;
import ntk.android.base.api.member.model.MemberPropertyDetailGroupRequest;
import ntk.android.base.api.member.model.MemberPropertyDetailGroupResponse;
import ntk.android.base.api.member.model.MemberPropertyDetailRequest;
import ntk.android.base.api.member.model.MemberPropertyDetailResponse;
import ntk.android.base.api.member.model.MemberPropertyDetailValueRequest;
import ntk.android.base.api.member.model.MemberPropertyDetailValueResponse;
import ntk.android.base.api.member.model.MemberPropertyRequest;
import ntk.android.base.api.member.model.MemberPropertyResponse;
import ntk.android.base.api.member.model.MemberPropertySiteRequest;
import ntk.android.base.api.member.model.MemberPropertySiteResponse;
import ntk.android.base.api.member.model.MemberPropertyTypeRequest;
import ntk.android.base.api.member.model.MemberPropertyTypeResponse;
import ntk.android.base.api.member.model.MemberUserActAddRequest;
import ntk.android.base.api.member.model.MemberUserGroupRequest;
import ntk.android.base.api.member.model.MemberUserGroupResponse;
import ntk.android.base.api.member.model.MemberUserRequest;
import ntk.android.base.api.member.model.MemberUserResponse;
import ntk.android.base.api.member.model.MemberUserSiteActAddeByJoinIdRequest;
import ntk.android.base.api.member.model.MemberUserSiteRequest;
import ntk.android.base.api.member.model.MemberUserSiteResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;


public interface IMember {
    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: MemberGroupActList"})
    Observable<MemberGroupResponse> GetGroupActList(@HeaderMap Map<String, String> headers, @Body MemberGroupRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: MemberHistoryActAdd"})
    Observable<MemberHistoryResponse> GetHistoryActAdd(@HeaderMap Map<String, String> headers, @Body MemberHistoryActAddRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: MemberHistoryActList"})
    Observable<MemberHistoryResponse> GetHistoryActList(@HeaderMap Map<String, String> headers, @Body MemberHistoryRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: MemberHistoryActView"})
    Observable<MemberHistoryResponse> GetHistoryActView(@HeaderMap Map<String, String> headers, @Body MemberHistoryActViewRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: MemberPropertyActAdd"})
    Observable<MemberPropertyResponse> SetPropertyActAdd(@HeaderMap Map<String, String> headers, @Body MemberPropertyActAddRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: MemberPropertyActList"})
    Observable<MemberPropertyResponse> GetPropertyActList(@HeaderMap Map<String, String> headers, @Body MemberPropertyRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: MemberPropertyActView"})
    Observable<MemberPropertyResponse> GetPropertyActView(@HeaderMap Map<String, String> headers, @Body MemberPropertyActViewRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: MemberPropertyActViewByJoinId"})
    Observable<MemberPropertyResponse> GetPropertyActViewByJoinId(@HeaderMap Map<String, String> headers, @Body MemberPropertyActViewByJoinIdRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: MemberPropertyDetailActList"})
    Observable<MemberPropertyDetailResponse> GetPropertyDetailActList(@HeaderMap Map<String, String> headers, @Body MemberPropertyDetailRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: MemberPropertyDetailGroupActList"})
    Observable<MemberPropertyDetailGroupResponse> GetPropertyDetailGroupActList(@HeaderMap Map<String, String> headers, @Body MemberPropertyDetailGroupRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: MemberPropertyDetailValueActList"})
    Observable<MemberPropertyDetailValueResponse> GetPropertyDetailValueActList(@HeaderMap Map<String, String> headers, @Body MemberPropertyDetailValueRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: MemberPropertySiteActList"})
    Observable<MemberPropertySiteResponse> GetPropertySiteActList(@HeaderMap Map<String, String> headers, @Body MemberPropertySiteRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: MemberPropertyTypeActList"})
    Observable<MemberPropertyTypeResponse> GetPropertyTypeActList(@HeaderMap Map<String, String> headers, @Body MemberPropertyTypeRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: MemberUserActList"})
    Observable<MemberUserResponse> GetUserActList(@HeaderMap Map<String, String> headers, @Body MemberUserRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: MemberUserGroupActList"})
    Observable<MemberUserGroupResponse> GetUserGroupActList(@HeaderMap Map<String, String> headers, @Body MemberUserGroupRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: MemberUserSiteActAddeByJoinId"})
    Observable<MemberUserSiteResponse> SetUserSiteActAddeByJoinId(@HeaderMap Map<String, String> headers, @Body MemberUserSiteActAddeByJoinIdRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: MemberUserSiteActList"})
    Observable<MemberUserSiteResponse> GetUserSiteActList(@HeaderMap Map<String, String> headers, @Body MemberUserSiteRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: MemberUserActAdd"})
    Observable<MemberUserResponse> SetUserActAdd(@HeaderMap Map<String, String> headers, @Body MemberUserActAddRequest request);

}

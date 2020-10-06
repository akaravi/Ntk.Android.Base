package ntk.base.api.linkManagemen.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.linkManagemen.model.LinkManagementTargetActShortLinkGetRequest;
import ntk.base.api.linkManagemen.model.LinkManagementTargetActShortLinkGetResponce;
import ntk.base.api.linkManagemen.model.LinkManagementTargetActShortLinkSetRequest;
import ntk.base.api.linkManagemen.model.LinkManagementTargetActShortLinkSetResponce;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ILinkManagement {
    @POST("api/v1/LinkManagementTarget/ShortLinkSet")
    @Headers({"content-type: application/json", "layout: ShortLinkSet"})
    Observable<LinkManagementTargetActShortLinkSetResponce> ShortLinkSet(@HeaderMap Map<String, String> headers, @Body LinkManagementTargetActShortLinkSetRequest request);
    @POST("api/v1/LinkManagementTarget/ShortLinkGet")
    @Headers({"content-type: application/json", "layout: ShortLinkGet"})
    Observable<LinkManagementTargetActShortLinkGetResponce> ShortLinkSet(@HeaderMap Map<String, String> headers, @Body LinkManagementTargetActShortLinkGetRequest request);
}

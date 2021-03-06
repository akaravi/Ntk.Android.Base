package ntk.android.base.api.linkManagemen.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.api.linkManagemen.model.LinkManagementTargetActShortLinkGetRequest;
import ntk.android.base.api.linkManagemen.model.LinkManagementTargetActShortLinkGetResponce;
import ntk.android.base.api.linkManagemen.model.LinkManagementTargetActShortLinkSetRequest;
import ntk.android.base.api.linkManagemen.model.LinkManagementTargetActShortLinkSetResponce;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

 interface ILinkManagement {

    @POST("/api/v1/LinkManagementTarget/ShortLinkSet")
    @Headers({"content-type: application/json", "layout: LinkManagementTargetActShortLinkSet"})
    Observable<LinkManagementTargetActShortLinkSetResponce> LinkManagementTargetActShortLinkSet(@HeaderMap Map<String, String> headers, @Body LinkManagementTargetActShortLinkSetRequest request);

    @POST("/api/v1/LinkManagementTarget/ShortLinkGet")
    @Headers({"content-type: application/json", "layout: LinkManagementTargetActShortLinkGet "})
    Observable<LinkManagementTargetActShortLinkGetResponce> LinkManagementTargetActShortLinkGet(@HeaderMap Map<String, String> headers, @Body LinkManagementTargetActShortLinkGetRequest request);
}

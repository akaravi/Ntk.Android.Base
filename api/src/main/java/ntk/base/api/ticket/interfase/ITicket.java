package ntk.base.api.ticket.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.ticket.model.TicketingAnswerListRequest;
import ntk.base.api.ticket.model.TicketingAnswerListResponse;
import ntk.base.api.ticket.model.TicketingAnswerSubmitRequest;
import ntk.base.api.ticket.model.TicketingAnswerSubmitResponse;
import ntk.base.api.ticket.model.TicketingDepartemenList;
import ntk.base.api.ticket.model.TicketingFaqListRequest;
import ntk.base.api.ticket.model.TicketingFaqListResponse;
import ntk.base.api.ticket.model.TicketingListRequest;
import ntk.base.api.ticket.model.TicketingListResponse;
import ntk.base.api.ticket.model.TicketingSubmitRequest;
import ntk.base.api.ticket.model.TicketingSubmitResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ITicket {

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: TicketingTaskActList"})
    Observable<TicketingListResponse> GetTicketList(@HeaderMap Map<String, String> headers, @Body TicketingListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: TicketingFaqActList"})
    Observable<TicketingFaqListResponse> GetTicketFaqList(@HeaderMap Map<String, String> headers, @Body TicketingFaqListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: TicketingTaskActSubmit"})
    Observable<TicketingSubmitResponse> SetTicketSubmit(@HeaderMap Map<String, String> headers, @Body TicketingSubmitRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: TicketingAnswerActSubmit"})
    Observable<TicketingAnswerSubmitResponse> GetTicketAnswerSubmit(@HeaderMap Map<String, String> headers, @Body TicketingAnswerSubmitRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: TicketingAnswerActList"})
    Observable<TicketingAnswerListResponse> GetTicketAnswerList(@HeaderMap Map<String, String> headers, @Body TicketingAnswerListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: TicketingDepartemenActList"})
    Observable<TicketingDepartemenList> GetTicketDepartman(@HeaderMap Map<String, String> headers);
}

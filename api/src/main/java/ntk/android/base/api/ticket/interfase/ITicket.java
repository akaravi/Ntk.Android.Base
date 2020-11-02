package ntk.android.base.api.ticket.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.api.baseModel.FilterModel;
import ntk.android.base.api.ticket.entity.TicketingTask;
import ntk.android.base.api.ticket.model.TicketingAnswerListRequest;
import ntk.android.base.api.ticket.model.TicketingAnswerResponse;
import ntk.android.base.api.ticket.model.TicketingAnswerSubmitRequest;
import ntk.android.base.api.ticket.model.TicketingDepartemenResponse;
import ntk.android.base.api.ticket.model.TicketingFaqRequest;
import ntk.android.base.api.ticket.model.TicketingFaqResponse;
import ntk.android.base.api.ticket.model.TicketingListRequest;
import ntk.android.base.api.ticket.model.TicketingTaskResponse;
import ntk.android.base.api.ticket.model.TicketingTemplateResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ITicket {

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: TicketingTaskActList"})
    Observable<TicketingTaskResponse> GetTicketTaskActList(@HeaderMap Map<String, String> headers, @Body TicketingListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: TicketingTaskActSubmit"})
    Observable<TicketingTaskResponse> SetTicketTaskActSubmit(@HeaderMap Map<String, String> headers, @Body TicketingTask request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: TicketingAnswerActSubmit"})
    Observable<TicketingAnswerResponse> GetTicketAnswerActSubmit(@HeaderMap Map<String, String> headers, @Body TicketingAnswerSubmitRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: TicketingAnswerActList"})
    Observable<TicketingAnswerResponse> GetTicketAnswerActList(@HeaderMap Map<String, String> headers, @Body TicketingAnswerListRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: TicketingDepartemenActList"})
    Observable<TicketingDepartemenResponse> GetTicketDepartmanActList(@HeaderMap Map<String, String> headers, @Body FilterModel request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: TicketingTemplateActList"})
    Observable<TicketingTemplateResponse> GetTicketTemplateActList(@HeaderMap Map<String, String> headers, @Body FilterModel request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: TicketingFaqActList"})
    Observable<TicketingFaqResponse> GetTicketFaqActList(@HeaderMap Map<String, String> headers, @Body TicketingFaqRequest request);




}

package ntk.android.base.entitymodel.ticketing;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class TicketingDepartemenLogModel extends BaseModuleEntity<Long> {
    @SerializedName("LinkFromOperatorId")
    public Long LinkFromOperatorId;
    @SerializedName("FromOperator")
    public TicketingDepartemenOperatorModel FromOperator;
    @SerializedName("LinkFromTicketingDepartemenId")
    public Long LinkFromTicketingDepartemenId;
    @SerializedName("FromTicketingDepartemen")
    public TicketingDepartemenModel FromTicketingDepartemen;
    @SerializedName("LinkToTicketingDepartemenId")
    public long LinkToTicketingDepartemenId;
    @SerializedName("ToTicketingDepartemen")
    public TicketingDepartemenModel ToTicketingDepartemen;
    @SerializedName("Tickets")
    public List<TicketingTaskModel> Tickets;
    @SerializedName("TicketAnswers")
    public List<TicketingAnswerModel> TicketAnswers;
    @SerializedName("Faqs")
    public List<TicketingFaqModel> Faqs;
    @SerializedName("Operators")
    public List<TicketingDepartemenOperatorModel> Operators;
}
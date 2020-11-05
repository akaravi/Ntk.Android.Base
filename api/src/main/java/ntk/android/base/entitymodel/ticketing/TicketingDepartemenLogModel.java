package ntk.android.base.entitymodel.ticketing;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class TicketingDepartemenLogModel extends BaseModuleEntity<Long> {
    @SerializedName("linkFromOperatorId")
    public Long linkFromOperatorId;
    @SerializedName("fromOperator")
    public TicketingDepartemenOperatorModel fromOperator;
    @SerializedName("linkFromTicketingDepartemenId")
    public Long linkFromTicketingDepartemenId;
    @SerializedName("fromTicketingDepartemen")
    public TicketingDepartemenModel fromTicketingDepartemen;
    @SerializedName("linkToTicketingDepartemenId")
    public long linkToTicketingDepartemenId;
    @SerializedName("toTicketingDepartemen")
    public TicketingDepartemenModel toTicketingDepartemen;
    @SerializedName("tickets")
    public List<TicketingTaskModel> tickets;
    @SerializedName("ticketAnswers")
    public List<TicketingAnswerModel> ticketAnswers;
    @SerializedName("faqs")
    public List<TicketingFaqModel> faqs;
    @SerializedName("operators")
    public List<TicketingDepartemenOperatorModel> operators;
}
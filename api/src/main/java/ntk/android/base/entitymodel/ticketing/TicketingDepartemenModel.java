package ntk.android.base.entitymodel.ticketing;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class TicketingDepartemenModel extends BaseModuleEntity<Long> {
    @SerializedName("title")
    public String title;
    @SerializedName("defaultAnswerBody")
    public String defaultAnswerBody;
    @SerializedName("priority")
    public EnumTicketingDepartemenPriority priority;
    @SerializedName("accessToChangeType")
    public EnumTicketAccessStatus accessToChangeType;
    @SerializedName("tickets")
    public List<TicketingTaskModel> tickets;
    @SerializedName("ticketAnswers")
    public List<TicketingAnswerModel> ticketAnswers;
    @SerializedName("faqs")
    public List<TicketingFaqModel> faqs;
    @SerializedName("operators")
    public List<TicketingDepartemenOperatorModel> operators;
}

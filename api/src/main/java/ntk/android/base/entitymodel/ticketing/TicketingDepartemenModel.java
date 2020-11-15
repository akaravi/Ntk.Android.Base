package ntk.android.base.entitymodel.ticketing;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;
import ntk.android.base.entitymodel.enums.EnumTicketAccessStatus;
import ntk.android.base.entitymodel.enums.EnumTicketingDepartemenPriority;

public class TicketingDepartemenModel extends BaseModuleEntity<Long> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("DefaultAnswerBody")
    public String DefaultAnswerBody;
    @SerializedName("Priority")
    public EnumTicketingDepartemenPriority Priority;
    @SerializedName("AccessToChangeType")
    public EnumTicketAccessStatus AccessToChangeType;
    @SerializedName("Tickets")
    public List<TicketingTaskModel> Tickets;
    @SerializedName("TicketAnswers")
    public List<TicketingAnswerModel> TicketAnswers;
    @SerializedName("Faqs")
    public List<TicketingFaqModel> Faqs;
    @SerializedName("Operators")
    public List<TicketingDepartemenOperatorModel> Operators;
}

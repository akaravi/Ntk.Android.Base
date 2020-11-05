package ntk.android.base.entitymodel.ticketing;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class TicketingFaqModel extends BaseModuleEntity<Long> {
    @SerializedName("question")
    public String question;
    @SerializedName("answer")
    public String answer;
    @SerializedName("linkTicketingDepartemenId")
    public Long linkTicketingDepartemenId;
    @SerializedName("virtual_TicketingDepartemen")
    public TicketingDepartemenModel virtual_TicketingDepartemen;
    @SerializedName("ticketingDepartemen")
    public TicketingDepartemenModel ticketingDepartemen;
    @SerializedName("linkFileIds")
    public String linkFileIds;
}

package ntk.android.base.entitymodel.ticketing;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class TicketingAnswerModel extends BaseModuleEntity<Long> {

    @SerializedName("linkTicketId")
    public    long linkTicketId;
    @SerializedName("htmlBody")
    public String htmlBody;
    @SerializedName("virtual_Ticket")
    public TicketingTaskModel virtual_Ticket;
    @SerializedName("ticket")
    public TicketingTaskModel ticket;
    @SerializedName("linkTicketingDepartemenId")
    public Long linkTicketingDepartemenId;
    @SerializedName("virtual_Departemen")
    public TicketingDepartemenModel virtual_Departemen;
    @SerializedName("departemen")
    public TicketingDepartemenModel departemen;
    @SerializedName("linkTypeOperatorId")
    public Long linkTypeOperatorId;
    @SerializedName("virtual_DepartemenOperator")
    public TicketingDepartemenOperatorModel virtual_DepartemenOperator;
    @SerializedName("departemenOperator")
    public TicketingDepartemenOperatorModel departemenOperator;
    @SerializedName("linkFileIds")
    public String linkFileIds;
    @SerializedName("linkFileIdsSrc")
    public List<String> linkFileIdsSrc;
}

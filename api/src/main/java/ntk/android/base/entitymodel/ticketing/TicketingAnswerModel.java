package ntk.android.base.entitymodel.ticketing;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class TicketingAnswerModel extends BaseModuleEntity<Long> {

    @SerializedName("LinkTaskId")
    public long LinkTaskId;
    @SerializedName("LinkMemberUserId")
    public long LinkMemberUserId;
    @SerializedName("HtmlBody")
    public String HtmlBody;
    @SerializedName(" virtual_Ticket")
    public TicketingTaskModel  virtual_Ticket;
    @SerializedName("Ticket")
    public TicketingTaskModel Ticket;
    @SerializedName("LinkTicketingDepartemenId")
    public Long LinkTicketingDepartemenId;
    @SerializedName(" virtual_Departemen")
    public TicketingDepartemenModel  virtual_Departemen;
    @SerializedName("Departemen")
    public TicketingDepartemenModel Departemen;
    @SerializedName("LinkTypeOperatorId")
    public Long LinkTypeOperatorId;
    @SerializedName(" virtual_DepartemenOperator")
    public TicketingDepartemenOperatorModel  virtual_DepartemenOperator;
    @SerializedName("DepartemenOperator")
    public TicketingDepartemenOperatorModel DepartemenOperator;
    @SerializedName("LinkFileIds")
    public String LinkFileIds;
    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;
    @SerializedName("UploadFileGUID")
    public List<String> UploadFileGUID;
}

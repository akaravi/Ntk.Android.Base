package ntk.android.base.entitymodel.ticketing;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;
import ntk.android.base.entitymodel.enums.EnumTicketStatus;
import ntk.android.base.entitymodel.enums.EnumTicketingDepartemenPriority;

public class TicketingTaskModel extends BaseModuleEntity<Long> {
    @SerializedName("expireDate")
    public String expireDate;
    @SerializedName("title")
    public String title;
    @SerializedName("htmlBody")
    public String htmlBody;
    @SerializedName("priority")
    public EnumTicketingDepartemenPriority priority;
    @SerializedName("linkCmsUserId")
    public Long linkCmsUserId;
    @SerializedName("linkMemberUserId")
    public Long linkMemberUserId;
    @SerializedName("linkTicketingDepartemenId")
    public Long linkTicketingDepartemenId;
    @SerializedName("ticketStatus")
    public EnumTicketStatus ticketStatus;
    @SerializedName("userIpAddress")
    public String userIpAddress;
    @SerializedName("deviceInformation")
    public String deviceInformation;
    @SerializedName("virtual_Departemen")
    public TicketingDepartemenModel virtual_Departemen;
    @SerializedName("departemen")
    public TicketingDepartemenModel departemen;
    @SerializedName("linkOperatorId")
    public Long linkOperatorId;
    @SerializedName("answers")
    public List<TicketingAnswerModel> answers;
    @SerializedName("ticketingDepartemenDefaultAnswerBody")
    public String ticketingDepartemenDefaultAnswerBody;
    @SerializedName("linkFileIds")
    public String linkFileIds;
    @SerializedName("linkFileIdsSrc")
    public List<String> linkFileIdsSrc;
}


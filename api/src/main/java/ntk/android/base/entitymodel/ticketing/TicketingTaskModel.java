package ntk.android.base.entitymodel.ticketing;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class TicketingTaskModel extends BaseModuleEntity<Long> {
    @SerializedName("ExpireDate")
    public String expireDate;
    @SerializedName("Title")
    public String title;
    @SerializedName("HtmlBody")
    public String htmlBody;
    @SerializedName("FullName")
    public String FullName;
    @SerializedName("PhoneNo")
    public String PhoneNo;
    @SerializedName("Email")
    public String Email;
    @SerializedName("Priority")
    public int priority;//as EnumTicketingDepartemenPriority
    @SerializedName("LinkCmsUserId")
    public Long linkCmsUserId;
    @SerializedName("LinkMemberUserId")
    public Long linkMemberUserId;
    @SerializedName("LinkTicketingDepartemenId")
    public Long linkTicketingDepartemenId;
    @SerializedName("TicketStatus")
    public int ticketStatus;// same as EnumTicketStatus
    @SerializedName("UserIpAddress")
    public String userIpAddress;
    @SerializedName("DeviceInformation")
    public String deviceInformation;
    @SerializedName("Virtual_Departemen")
    public TicketingDepartemenModel virtual_Departemen;
    @SerializedName("Departemen")
    public TicketingDepartemenModel departemen;
    @SerializedName("LinkOperatorId")
    public Long linkOperatorId;
    @SerializedName("Answers")
    public List<TicketingAnswerModel> answers;
    @SerializedName("TicketingDepartemenDefaultAnswerBody")
    public String ticketingDepartemenDefaultAnswerBody;
    @SerializedName("LinkFileIds")
    public String linkFileIds;
    @SerializedName("LinkFileIdsSrc")
    public List<String> linkFileIdsSrc;
}


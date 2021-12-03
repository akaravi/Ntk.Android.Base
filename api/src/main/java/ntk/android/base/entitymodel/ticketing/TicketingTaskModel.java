package ntk.android.base.entitymodel.ticketing;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class TicketingTaskModel extends BaseModuleEntity<Long> {
    @SerializedName("ExpireDate")
    public String ExpireDate;
    @SerializedName("Title")
    public String Title;
    @SerializedName("HtmlBody")
    public String HtmlBody;
    @SerializedName("FullName")
    public String FullName;
    @SerializedName("PhoneNo")
    public String PhoneNo;
    @SerializedName("Email")
    public String Email;
    @SerializedName("Priority")
    public int Priority;//as EnumTicketingDepartemenPriority
    @SerializedName("LinkCmsUserId")
    public Long LinkCmsUserId;
    @SerializedName("LinkMemberUserId")
    public Long LinkMemberUserId;
    @SerializedName("LinkTicketingDepartemenId")
    public Long LinkTicketingDepartemenId;
    @SerializedName("TicketStatus")
    public int TicketStatus;// same as EnumTicketStatus
    @SerializedName("UserIpAddress")
    public String UserIpAddress;
    @SerializedName("DeviceInformation")
    public String DeviceInformation;
    @SerializedName(" virtual_Departemen")
    public TicketingDepartemenModel  virtual_Departemen;
    @SerializedName("Departemen")
    public TicketingDepartemenModel Departemen;
    @SerializedName("LinkOperatorId")
    public Long LinkOperatorId;
    @SerializedName("Answers")
    public List<TicketingAnswerModel> Answers;
    @SerializedName("TicketingDepartemenDefaultAnswerBody")
    public String TicketingDepartemenDefaultAnswerBody;
    @SerializedName("LinkFileIds")
    public String LinkFileIds;
    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;
    @SerializedName("UploadFileGUID")
    public List<String> UploadFileGUID;
}


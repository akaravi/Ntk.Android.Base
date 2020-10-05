package ntk.base.api.ticket.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseEntity;

public class TicketingTask extends BaseEntity {

    @SerializedName("Id")
    public Long Id;

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("Title")
    public String Title;

    @SerializedName("FullName")
    public String FullName;

    @SerializedName("Email")
    public String Email;

    @SerializedName("PhoneNo")
    public String PhoneNo;
    @SerializedName("HtmlBody")
    public String HtmlBody;

    @SerializedName("Priority")
    public int Priority;


    @SerializedName("LinkCmsUserId")
    public Long LinkCmsUserId;

    @SerializedName("LinkMemberUserId")
    public Long LinkMemberUserId;


    @SerializedName("LinkTicketingDepartemenId")
    public Long LinkTicketingDepartemenId;

    @SerializedName("TicketStatus")
    public int TicketStatus;

    @SerializedName("LinkTicketTypeId")
    public Long LinkTicketTypeId;

    @SerializedName("LinkOperatorId")
    public Long LinkOperatorId;


    @SerializedName("UserIpAddress")
    public String UserIpAddress;

    @SerializedName("DeviceInformation")
    public String DeviceInformation;

    @SerializedName("Departemen")
    public TicketingDepartemen Departemen;

    @SerializedName("virtual_Departemen")
    public TicketingDepartemen virtual_Departemen;

    @SerializedName("Answers")
    public List<TicketingAnswer> Answers;

    @SerializedName("LinkFileIds")
    public String LinkFileIds;

    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;
}

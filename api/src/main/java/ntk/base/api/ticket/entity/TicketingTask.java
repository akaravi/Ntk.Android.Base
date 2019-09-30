package ntk.base.api.ticket.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseEntity;

public class TicketingTask extends BaseEntity {

    @SerializedName("Id")
    public Long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("Question")
    public String Question;

    @SerializedName("Answer")
    public String Answer;

    @SerializedName("HtmlBody")
    public String HtmlBody;

    @SerializedName("Priority")
    public int Priority;

    @SerializedName("LinkCmsUserId")
    public String LinkCmsUserId;

    @SerializedName("LinkMemberUserId")
    public String LinkMemberUserId;

    @SerializedName("LinkTicketTypeId")
    public String LinkTicketTypeId;

    @SerializedName("TicketStatus")
    public int TicketStatus;

    @SerializedName("UserIpAddress")
    public String UserIpAddress;

    @SerializedName("DeviceInformation")
    public String DeviceInformation;

    @SerializedName("virtual_Departemen")
    public TicketingDepartemen virtual_Departemen;


}

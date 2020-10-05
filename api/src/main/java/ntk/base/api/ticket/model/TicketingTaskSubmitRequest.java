package ntk.base.api.ticket.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.ticket.entity.TicketingTask;

public class TicketingTaskSubmitRequest extends TicketingTask {

    @SerializedName("Name")
    public String Name;

    @SerializedName("Email")
    public String Email;

    @SerializedName("PhoneNo")
    public String PhoneNo;

    @SerializedName("UploadName")
    public String UploadName;

    @SerializedName("LinkTicketingDepartemenId")
    public String LinkTicketingDepartemenId;



    @SerializedName("LinkFileIds")
    public String LinkFileIds;
}

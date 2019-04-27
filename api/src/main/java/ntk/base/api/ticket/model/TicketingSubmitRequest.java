package ntk.base.api.ticket.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TicketingSubmitRequest extends TicketingTask {

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

    @SerializedName("uploadName")
    public List<String> uploadName;
}

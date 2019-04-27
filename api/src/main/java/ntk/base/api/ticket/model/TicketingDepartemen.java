package ntk.base.api.ticket.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseEntity;

public class TicketingDepartemen  extends BaseEntity {

    @SerializedName("Id")
    public int Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("DefaultAnswerBody")
    public String DefaultAnswerBody;

    @SerializedName("Priority")
    public int Priority;

    @SerializedName("AccessToChangeType")
    public int AccessToChangeType;

}

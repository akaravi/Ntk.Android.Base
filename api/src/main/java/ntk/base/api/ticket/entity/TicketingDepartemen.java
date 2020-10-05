package ntk.base.api.ticket.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseEntity;

public class TicketingDepartemen  extends BaseEntity {

    @SerializedName("Id")
    public long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("DefaultAnswerBody")
    public String DefaultAnswerBody;

    @SerializedName("Priority")
    public int Priority;

    @SerializedName("AccessToChangeType")
    public int AccessToChangeType;

}

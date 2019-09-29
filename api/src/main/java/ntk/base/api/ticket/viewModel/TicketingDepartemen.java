package ntk.base.api.ticket.viewModel;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseEntity;

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

package ntk.android.base.api.ticket.entity;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.BaseEntity;

public class TicketingDepartemenLog extends BaseEntity {

    @SerializedName("Id")
    public long Id;

    @SerializedName("LinkTaskId")
    public long LinkTaskId;

    @SerializedName("LinkFromOperatorId")
    public Long LinkFromOperatorId;

    @SerializedName("LinkToOperatorId")
    public Long LinkToOperatorId;


    @SerializedName("LinkFromTicketingDepartemenId")
    public Long LinkFromTicketingDepartemenId;

    @SerializedName("LinkToTicketingDepartemenId")
    public Long LinkToTicketingDepartemenId;


}

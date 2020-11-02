package ntk.android.base.api.ticket.entity;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.BaseEntity;

public class TicketingTemplate extends BaseEntity {

    @SerializedName("Id")
    public Long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("HtmlBody")
    public String HtmlBody;

    @SerializedName("LinkTicketingDepartemenId")
    public Long LinkTicketingDepartemenId;

}

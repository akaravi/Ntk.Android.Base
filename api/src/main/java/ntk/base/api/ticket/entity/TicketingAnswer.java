package ntk.base.api.ticket.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseEntity;

public class TicketingAnswer extends BaseEntity {

    @SerializedName("Id")
    public Long Id;

    @SerializedName("LinkTaskId")
    public Long LinkTaskId;

    @SerializedName("HtmlBody")
    public String HtmlBody;

    @SerializedName("LinkTicketingDepartemenId")
    public Long LinkTicketingDepartemenId;

    @SerializedName("LinkTypeOperatorId")
    public Long LinkTypeOperatorId;

    @SerializedName("LinkFileIds")
    public String LinkFileIds;
    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;
}

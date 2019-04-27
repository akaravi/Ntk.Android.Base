package ntk.base.api.ticket.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseEntity;

public class TicketingAnswer extends BaseEntity {

    @SerializedName("LinkTicketId")
    public Long LinkTicketId;

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

    @SerializedName("Id")
    public Long Id;

}

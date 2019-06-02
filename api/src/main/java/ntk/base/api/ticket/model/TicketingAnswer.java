package ntk.base.api.ticket.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseEntity;

public class TicketingAnswer extends BaseEntity {

    @SerializedName("LinkTicketId")
    public Long LinkTicketId;

    @SerializedName("HtmlBody")
    public String HtmlBody;

    @SerializedName("LinkFileIds")
    public String LinkFileIds;
}

package ntk.base.api.ticket.viewModel;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseEntity;

public class TicketingAnswer extends BaseEntity {

    @SerializedName("LinkTicketId")
    public Long LinkTicketId;

    @SerializedName("HtmlBody")
    public String HtmlBody;

    @SerializedName("LinkFileIds")
    public String LinkFileIds;
}

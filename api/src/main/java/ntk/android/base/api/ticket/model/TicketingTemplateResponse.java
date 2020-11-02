package ntk.android.base.api.ticket.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.ticket.entity.TicketingTemplate;

public class TicketingTemplateResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<TicketingTemplate> ListItems;

    @SerializedName("Item")
    public TicketingTemplate Item;
}

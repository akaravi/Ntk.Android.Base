package ntk.base.api.ticket.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.ticket.entity.TicketingTemplate;

public class TicketingTemplateResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<TicketingTemplate> ListItems;

    @SerializedName("Item")
    public TicketingTemplate Item;
}

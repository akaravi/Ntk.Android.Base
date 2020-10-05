package ntk.base.api.ticket.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.ticket.entity.TicketingTask;

public class TicketingResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<TicketingTask> ListItems;

    @SerializedName("Item")
    public TicketingTask Item;
}

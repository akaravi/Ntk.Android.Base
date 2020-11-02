package ntk.android.base.api.ticket.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.ticket.entity.TicketingTask;

public class TicketingTaskResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<TicketingTask> ListItems;

    @SerializedName("Item")
    public TicketingTask Item;
}

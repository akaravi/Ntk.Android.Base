package ntk.base.api.ticket.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.ticket.viewModel.TicketingDepartemen;

public class TicketingDepartemenList extends ErrorException {

    @SerializedName("ListItems")
    public List<TicketingDepartemen> ListItems;

    @SerializedName("Item")
    public TicketingDepartemen Item;
}

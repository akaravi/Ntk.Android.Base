package ntk.android.base.api.ticket.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.ticket.entity.TicketingDepartemen;

public class TicketingDepartemenResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<TicketingDepartemen> ListItems;

    @SerializedName("Item")
    public TicketingDepartemen Item;
}

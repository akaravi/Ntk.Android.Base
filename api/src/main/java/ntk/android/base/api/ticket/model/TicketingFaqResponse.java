package ntk.android.base.api.ticket.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.ticket.entity.TicketingFaq;

public class TicketingFaqResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<TicketingFaq> ListItems;

    @SerializedName("Item")
    public TicketingFaq Item;
}

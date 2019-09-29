package ntk.base.api.ticket.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.ticket.viewModel.TicketingAnswer;

public class TicketingAnswerListResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<TicketingAnswer> ListItems;

    @SerializedName("Item")
    public TicketingAnswer Item;

}

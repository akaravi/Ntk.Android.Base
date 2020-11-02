package ntk.android.base.api.ticket.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.ticket.entity.TicketingAnswer;

public class TicketingAnswerResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<TicketingAnswer> ListItems;

    @SerializedName("Item")
    public TicketingAnswer Item;

}

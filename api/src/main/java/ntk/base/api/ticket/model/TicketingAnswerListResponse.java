package ntk.base.api.ticket.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class TicketingAnswerListResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<TicketingAnswer> ListItems;

    @SerializedName("Main")
    public TicketingAnswer Item;

}

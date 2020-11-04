package ntk.android.base.entitymodel.base;

import com.google.gson.annotations.SerializedName;

public class ItemState<TcClass> {
    @SerializedName("Item")
    public TcClass Item;
    @SerializedName("ActionStart")
    public boolean ActionStart = false;
    @SerializedName("ActionEnd")
    public boolean ActionEnd = false;
    @SerializedName("Status")
    public String Status;
    @SerializedName("Message")
    public String Message;
}

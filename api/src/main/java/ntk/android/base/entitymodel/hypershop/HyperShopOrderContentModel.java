package ntk.android.base.entitymodel.hypershop;

import com.google.gson.annotations.SerializedName;

public class HyperShopOrderContentModel {
    @SerializedName("LinkOrderId")
    public Long LinkOrderId;
    @SerializedName("Order")
    public HyperShopOrderModel Order;
    @SerializedName("Code")
    public String Code;
    @SerializedName("Name")
    public String Name;
    @SerializedName("Memo")
    public String Memo;
    @SerializedName("Price")
    public double Price;
    @SerializedName("Count")
    public int Count;
}

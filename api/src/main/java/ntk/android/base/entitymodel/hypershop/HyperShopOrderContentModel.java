package ntk.android.base.entitymodel.hypershop;

import com.google.gson.annotations.SerializedName;

public class HyperShopOrderContentModel {
    public static String CURRENCY_UNIT = "ریال";

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
    @SerializedName("TotalCount")
    public int TotalCount;
    @SerializedName("Image")
    public String Image;
    @SerializedName("Unit")
    public String Unit;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HyperShopOrderContentModel)
            if (((HyperShopOrderContentModel) obj).Code.equals(this.Code))
                return true;
        return false;
    }

}

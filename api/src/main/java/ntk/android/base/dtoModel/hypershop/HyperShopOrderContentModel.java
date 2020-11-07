package ntk.android.base.dtomodel.hypershop;

import com.google.gson.annotations.SerializedName;

public class HyperShopOrderContentModel {
    @SerializedName("code")
    public String code;
    @SerializedName("name")
    public String name;
    @SerializedName("memo")
    public String memo;
    @SerializedName("price")
    public float price;
    @SerializedName("count")
    public int count;
}

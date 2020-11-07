package ntk.android.base.dtomodel.hypershop;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HyperShopOrderModel {
    @SerializedName("OrderId")
    public String OrderId;
    @SerializedName("AcceptSystem")
    public Boolean AcceptSystem;
    @SerializedName("name")
    public String name;
    @SerializedName("family")
    public String family;
    @SerializedName("mobile")
    public String mobile;
    @SerializedName("address")
    public String address;
    @SerializedName("amount")
    public float amount;
    @SerializedName("Products")
    public List<HyperShopOrderContentModel> Products;
}

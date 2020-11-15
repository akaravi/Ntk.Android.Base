package ntk.android.base.dtomodel.hypershop;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HyperShopOrderModel {
    @SerializedName("OrderId")
    public String OrderId;
    @SerializedName("AcceptSystem")
    public Boolean AcceptSystem;
    @SerializedName("Name")
    public String Name;
    @SerializedName("Family")
    public String Family;
    @SerializedName("Mobile")
    public String Mobile;
    @SerializedName("Address")
    public String Address;
    @SerializedName("Amount")
    public float Amount;
    @SerializedName("Products")
    public List<HyperShopOrderContentModel> Products;
}

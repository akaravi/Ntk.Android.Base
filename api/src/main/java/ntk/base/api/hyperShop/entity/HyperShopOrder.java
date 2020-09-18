package ntk.base.api.hyperShop.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HyperShopOrder {
    @SerializedName("OrderId")
    public String OrderId;
    @SerializedName("AcceptSystem")
    public Boolean AcceptSystem;
    @SerializedName("name")
    public String name;
    @SerializedName("family")
    public String family ;
    @SerializedName("mobile")
    public String mobile ;
    @SerializedName("address")
    public String address ;
    @SerializedName("amount")
    public String amount;
    @SerializedName("Products")
    public List<HyperShopContent> Products ;


}
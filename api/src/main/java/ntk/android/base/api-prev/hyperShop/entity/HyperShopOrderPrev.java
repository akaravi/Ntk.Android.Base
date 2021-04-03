package ntk.android.base.api.hyperShop.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HyperShopOrderPrev {
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
    public List<HyperShopContentPrev> Products ;


}

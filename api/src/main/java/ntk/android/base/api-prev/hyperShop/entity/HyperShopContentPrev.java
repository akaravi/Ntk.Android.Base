package ntk.android.base.api.hyperShop.entity;

import com.google.gson.annotations.SerializedName;

public class HyperShopContentPrev {
    @SerializedName("code")
    public String code ;
    @SerializedName("name")
    public String name ;
    @SerializedName("cat")
    public String cat ;
    @SerializedName("status")
    public boolean status ;

    @SerializedName("image")
    public String image ;
    @SerializedName("memo")
    public String memo ;
    @SerializedName("price")
    public double price ;
    @SerializedName("count")
    public int count;
}

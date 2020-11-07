package ntk.android.base.dtomodel.hypershop;

import com.google.gson.annotations.SerializedName;

public class HyperShopContentModel {
    @SerializedName("code")
    public String code;
    @SerializedName("name")
    public String name;
    @SerializedName("cat")
    public String cat;
    @SerializedName("status")
    public boolean status;

    @SerializedName("image")
    public String image;
    @SerializedName("memo")
    public String memo;
    @SerializedName("price")
    public float price;
    @SerializedName("count")
    public int count;
}

package ntk.android.base.dtomodel.hypershop;

import com.google.gson.annotations.SerializedName;

public class HyperShopOrderContentDtoModel {
    @SerializedName("Code")
    public String Code;
    @SerializedName("Name")
    public String Name;
    @SerializedName("Memo")
    public String Memo;
    @SerializedName("Price")
    public float Price;
    @SerializedName("Count")
    public int Count;
    @SerializedName("Image")
    public String Image;
}

package ntk.android.base.dtomodel.hypershop;

import com.google.gson.annotations.SerializedName;

public class HyperShopContentModel {
    @SerializedName("Code")
    public String Code;
    @SerializedName("Name")
    public String Name;
    @SerializedName("Cat")
    public String Cat;
    @SerializedName("Status")
    public boolean Status;

    @SerializedName("Image")
    public String Image;
    @SerializedName("Memo")
    public String Memo;
    @SerializedName("Price")
    public float Price;
    @SerializedName("Count")
    public int Count;
}

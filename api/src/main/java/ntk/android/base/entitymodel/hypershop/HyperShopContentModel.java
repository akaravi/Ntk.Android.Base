package ntk.android.base.entitymodel.hypershop;

import com.google.gson.annotations.SerializedName;

public class HyperShopContentModel {
    public static String CURRENCY_UNIT = "تومان";

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

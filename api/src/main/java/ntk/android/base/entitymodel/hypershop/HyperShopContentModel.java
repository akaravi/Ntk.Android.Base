package ntk.android.base.entitymodel.hypershop;

import com.google.gson.annotations.SerializedName;

public class HyperShopContentModel {
    public static String CURRENCY_UNIT = "ریال";

    @SerializedName("Code")
    public String Code;
    @SerializedName("Name")
    public String Name;
    @SerializedName("Category")
    public String Category;
    @SerializedName("CategoryCode")
    public int CategoryCode;
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

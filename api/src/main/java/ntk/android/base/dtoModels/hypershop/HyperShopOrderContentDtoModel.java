package ntk.android.base.dtomodel.hypershop;

import com.google.gson.annotations.SerializedName;

public class HyperShopOrderContentDtoModel {
    public static String CURRENCY_UNIT = "ریال";

    @SerializedName("Code")
    public String Code;
    @SerializedName("Name")
    public String Name;
    @SerializedName("Memo")
    public String Memo;
    @SerializedName("Price")
    public double Price;
    @SerializedName("Count")
    public int Count;
    @SerializedName("TotalCount")
    public int TotalCount;
    @SerializedName("Image")
    public String Image;
}

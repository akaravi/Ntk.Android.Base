package ntk.android.base.dtomodel.theme;

import com.google.gson.annotations.SerializedName;

public class ThemeChildConfigDtoModel {

    @SerializedName("SortId")
    public int SortId;

    @SerializedName("Title")
    public String Title;

    @SerializedName("BgColor")
    public String BgColor;

    @SerializedName("FrontColor")
    public String FrontColor;

    @SerializedName("FontSize")
    public String FontSize;

    @SerializedName("Href")
    public String Href;

    @SerializedName("ActionName")
    public String ActionName;

    @SerializedName("ActionRequest")
    public String ActionRequest;
}

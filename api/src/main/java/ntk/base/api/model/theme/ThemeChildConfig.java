package ntk.base.api.model.theme;

import com.google.gson.annotations.SerializedName;

public class ThemeChildConfig {

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

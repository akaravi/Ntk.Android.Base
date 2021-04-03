package ntk.android.base.api.baseModel.theme;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ThemeChild {

    @SerializedName("SortId")
    public int SortId;

    @SerializedName("LayoutTheme")
    public int LayoutTheme;

    @SerializedName("LayoutName")
    public String LayoutName;

    @SerializedName("LayoutChildConfig")
    public List<ThemeChildConfig> LayoutChildConfigs;

    @SerializedName("LayoutConfig")
    public List<ThemeChildConfig> LayoutConfig;

    @SerializedName("LayoutRequest")
    public String LayoutRequest;
}

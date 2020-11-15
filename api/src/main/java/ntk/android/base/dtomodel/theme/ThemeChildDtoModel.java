package ntk.android.base.dtomodel.theme;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ThemeChildDtoModel {

    @SerializedName("SortId")
    public int SortId;

    @SerializedName("LayoutTheme")
    public int LayoutTheme;

    @SerializedName("LayoutName")
    public String LayoutName;

    @SerializedName("LayoutChildConfig")
    public List<ThemeChildConfigDtoModel> LayoutChildConfigs;

    @SerializedName("LayoutConfig")
    public List<ThemeChildConfigDtoModel> LayoutConfig;

    @SerializedName("LayoutRequest")
    public String LayoutRequest;
}

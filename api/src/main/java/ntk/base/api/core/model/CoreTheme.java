package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CoreTheme {

    @SerializedName("AppThemeId")
    public int AppThemeId;

    @SerializedName("AppThemeTypeId")
    public String AppThemeTypeId;

    @SerializedName("RuntimeConfigTheme")
    public String RuntimeConfigTheme;

    @SerializedName("BuilderConfigTheme")
    public String BuilderConfigTheme;

    @SerializedName("RuntimeConfigSiteAdmin")
    public String RuntimeConfigSiteAdmin;

    @SerializedName("RuntimeConfigMainAdmin")
    public String RuntimeConfigMainAdmin;

    @SerializedName("ThemeConfigLayout")
    public List<ThemeConfigLayout> ThemeConfigLayout;

    @SerializedName("ThemeConfigJson")
    public String ThemeConfigJson;
}

package ntk.base.api.core.viewModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Theme {

    @SerializedName("AppThemeId")
    public int AppThemeId;

    @SerializedName("AppThemeTypeId")
    public String AppThemeTypeId;

//    @SerializedName("RuntimeConfigTheme")
//    public String RuntimeConfigTheme;
//
//    @SerializedName("BuilderConfigTheme")
//    public String BuilderConfigTheme;
//
//    @SerializedName("RuntimeConfigSiteAdmin")
//    public String RuntimeConfigSiteAdmin;
//
//    @SerializedName("RuntimeConfigMainAdmin")
//    public String RuntimeConfigMainAdmin;

    @SerializedName("ThemeConfigLayout")
    public List<ThemeConfigLayout> ThemeConfigLayout;

    @SerializedName("ThemeConfigJson")
    public ntk.base.api.baseModel.theme.Theme ThemeConfigJson;
}

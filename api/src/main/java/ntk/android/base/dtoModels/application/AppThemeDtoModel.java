package ntk.android.base.dtomodel.application;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.dtomodel.theme.ThemeConfigDtoModel;
import ntk.android.base.dtomodel.theme.ThemeDtoModel;

public class AppThemeDtoModel {

    @SerializedName("AppThemeId")
    public int AppThemeId;

    @SerializedName("AppThemeTypeId")
    public String AppThemeTypeId;

    @SerializedName("ThemeConfigLayout")
    public List<ThemeConfigDtoModel> ThemeConfigLayout;

    @SerializedName("ThemeConfigJson")
    public ThemeDtoModel ThemeConfigJson;
}

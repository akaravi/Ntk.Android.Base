package ntk.android.base.dtomodel.application;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ThemeDtoModel {

    @SerializedName("AppThemeId")
    public int AppThemeId;

    @SerializedName("AppThemeTypeId")
    public String AppThemeTypeId;

    @SerializedName("ThemeConfigLayout")
    public List<ntk.android.base.api.core.entity.ThemeConfigLayout> ThemeConfigLayout;

    @SerializedName("ThemeConfigJson")
    public ntk.android.base.api.baseModel.theme.Theme ThemeConfigJson;
}

package ntk.base.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BaseThemeConfig{

    @SerializedName("AppThemeId")
    public long AppThemeId;

    @SerializedName("AppThemeTypeId")
    public String AppThemeTypeId;

    @SerializedName("ThemeConfigLayout")
    public List<ThemeConfigLayoutModel> ThemeConfigLayout;

}

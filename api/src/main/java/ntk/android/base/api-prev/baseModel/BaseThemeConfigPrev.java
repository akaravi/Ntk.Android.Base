package ntk.android.base.api.baseModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BaseThemeConfigPrev {

    @SerializedName("AppThemeId")
    public long AppThemeId;

    @SerializedName("AppThemeTypeId")
    public String AppThemeTypeId;

    @SerializedName("ThemeConfigLayout")
    public List<ThemeConfigLayoutModelPrev> ThemeConfigLayout;

}

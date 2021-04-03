package ntk.android.base.api.baseModel.theme;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ThemePrev {

    @SerializedName("Toolbar")
    public ToolbarPrev Toolbar;

    @SerializedName("ThemeConfigLayout")
    public List<ThemeChild> Childs;
}

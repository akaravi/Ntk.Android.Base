package ntk.android.base.dtomodel.theme;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ThemeDtoModel {

    @SerializedName("Toolbar")
    public ToolbarDtoModel Toolbar;

    @SerializedName("ThemeConfigLayout")
    public List<ThemeChildDtoModel> Childs;
}

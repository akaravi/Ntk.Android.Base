package ntk.android.base.dtomodel.theme;

import com.google.gson.annotations.SerializedName;

public class DrawerChildThemeDtoModel {
    @SerializedName("Id")
    public int Id;

    @SerializedName("Type")
    public int Type;

    @SerializedName("Title")
    public String Title;

    @SerializedName("Icon")
    public String Icon;

    @SerializedName("Icon")
    public int drawableIcon;

    public DrawerChildThemeDtoModel setId(int id) {
        Id = id;
        return this;
    }

    public DrawerChildThemeDtoModel setType(int type) {
        Type = type;
        return this;
    }

    public DrawerChildThemeDtoModel setTitle(String title) {
        Title = title;
        return this;
    }

    public DrawerChildThemeDtoModel setIcon(String icon) {
        Icon = icon;
        return this;
    }

    public DrawerChildThemeDtoModel setDrawableIcon(int drawableIcon) {
        this.drawableIcon = drawableIcon;
        return this;
    }
}

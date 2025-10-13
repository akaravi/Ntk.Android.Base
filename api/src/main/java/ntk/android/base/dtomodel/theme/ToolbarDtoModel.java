package ntk.android.base.dtomodel.theme;

import com.google.gson.annotations.SerializedName;

public class ToolbarDtoModel {

    @SerializedName("Type")
    public int Type;

    @SerializedName("BackgroundColor")
    public String BackgroundColor;

    @SerializedName("ColorBelowLine")
    public String ColorBelowLine;

    @SerializedName("HamberMenu")
    public HamberMenuThemeDtoModel HamberMenuThemeDtoModel;

    @SerializedName("SearchBox")
    public SearchBoxThemeDtoModel SearchBox;

    @SerializedName("ShoppingCart")
    public ShoppingCartThemeDtoModel Cart;

    @SerializedName("Drawer")
    public DrawerThemeDtoModel DrawerThemeDtoModel;
}

package ntk.android.base.api.baseModel.theme;

import com.google.gson.annotations.SerializedName;

public class ToolbarPrev {

    @SerializedName("Type")
    public int Type;

    @SerializedName("BackgroundColor")
    public String BackgroundColor;

    @SerializedName("ColorBelowLine")
    public String ColorBelowLine;

    @SerializedName("HamberMenu")
    public HamberMenuPrev HamberMenu;

    @SerializedName("SearchBox")
    public SearchBoxPrev SearchBox;

    @SerializedName("ShoppingCart")
    public ShoppingCartPrev Cart;

    @SerializedName("Drawer")
    public DrawerPrev Drawer;
}

package ntk.android.base.dtomodel.theme;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DrawerThemeDtoModel {

    @SerializedName("Type")
    public int Type;

    @SerializedName("HeaderImage")
    public String HeaderImage;

    @SerializedName("CircleImage")
    public String CircleImage;

    @SerializedName("DrawerChilds")
    public List<DrawerChildThemeDtoModel> Child;
}
package ntk.android.base.api.baseModel.theme;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DrawerPrev {

    @SerializedName("Type")
    public int Type;

    @SerializedName("HeaderImage")
    public String HeaderImage;

    @SerializedName("CircleImage")
    public String CircleImage;

    @SerializedName("DrawerChilds")
    public List<DrawerChildPrev> Child;
}
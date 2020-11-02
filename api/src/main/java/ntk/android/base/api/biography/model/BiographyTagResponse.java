package ntk.android.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.biography.entity.BiographyTag;

public class BiographyTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyTag> ListItems;

    @SerializedName("Item")
    public BiographyTag Item;
}

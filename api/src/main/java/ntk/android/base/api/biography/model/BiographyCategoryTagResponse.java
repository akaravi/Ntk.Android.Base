package ntk.android.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.biography.entity.BiographyCategoryTag;

public class BiographyCategoryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyCategoryTag> ListItems;

    @SerializedName("Item")
    public BiographyCategoryTag Item;
}

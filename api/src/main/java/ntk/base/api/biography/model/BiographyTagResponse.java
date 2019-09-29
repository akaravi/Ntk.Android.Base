package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.biography.viewModel.BiographyTag;

public class BiographyTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyTag> ListItems;

    @SerializedName("Item")
    public BiographyTag Item;
}

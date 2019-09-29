package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.biography.viewModel.BiographyCategoryTag;

public class BiographyCategoryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyCategoryTag> ListItems;

    @SerializedName("Item")
    public BiographyCategoryTag Item;
}

package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.biography.viewModel.BiographyCategory;

public class BiographyCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyCategory> ListItems;

    @SerializedName("Item")
    public BiographyCategory Item;
}

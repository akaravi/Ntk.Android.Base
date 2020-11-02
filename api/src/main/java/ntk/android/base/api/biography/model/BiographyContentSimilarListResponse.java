package ntk.android.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.biography.entity.BiographyCategory;

public class BiographyContentSimilarListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyCategory> ListItems;

    @SerializedName("Item")
    public BiographyCategory Item;
}

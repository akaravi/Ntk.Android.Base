package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class BiographyContentSimilarListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyCategory> ListItems;

    @SerializedName("Main")
    public BiographyCategory Item;
}

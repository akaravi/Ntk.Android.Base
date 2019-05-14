package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class BiographyContentWithSimilarLocationResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyContentWithSimilarLocation> ListItems;

    @SerializedName("Item")
    public BiographyContentWithSimilarLocation Item;
}

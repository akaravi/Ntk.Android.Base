package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class BiographyContentFavoriteListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyContent> ListItems;

    @SerializedName("Item")
    public BiographyContent Item;
}

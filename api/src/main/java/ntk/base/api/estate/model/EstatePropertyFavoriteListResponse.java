package ntk.base.api.estate.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class EstatePropertyFavoriteListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<EstateProperty> ListItems;

    @SerializedName("Item")
    public EstateProperty Item;
}

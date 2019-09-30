package ntk.base.api.estate.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.estate.entity.EstateProperty;

public class EstatePropertyFavoriteListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<EstateProperty> ListItems;

    @SerializedName("Item")
    public EstateProperty Item;
}

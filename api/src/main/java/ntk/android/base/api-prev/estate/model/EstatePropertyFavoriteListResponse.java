package ntk.android.base.api.estate.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.estate.entity.EstateProperty;

public class EstatePropertyFavoriteListResponse extends ErrorExceptionPrev {

    @SerializedName("ListItems")
    public List<EstateProperty> ListItems;

    @SerializedName("Item")
    public EstateProperty Item;
}

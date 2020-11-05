package ntk.android.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.core.entity.CoreLocation;

public class CoreLocationResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<CoreLocation> ListItems;

    @SerializedName("Item")
    public CoreLocation Item;
}
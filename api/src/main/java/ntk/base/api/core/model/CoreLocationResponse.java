package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CoreLocationResponse {
    @SerializedName("ListItems")
    public List<CoreLocation> ListItems;

    @SerializedName("Main")
    public CoreLocation Item;
}

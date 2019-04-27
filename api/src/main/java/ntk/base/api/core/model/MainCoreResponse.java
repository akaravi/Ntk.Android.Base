package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.ErrorException;

public class MainCoreResponse extends ErrorException {

    @SerializedName("Item")
    public Item Item;
}

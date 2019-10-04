package ntk.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.object.entity.ObjectHistory;
import ntk.base.api.object.entity.ObjectProperty;

public class ObjectPropertyResonse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectProperty> ListItems;

    @SerializedName("Item")
    public ObjectProperty Item;
}

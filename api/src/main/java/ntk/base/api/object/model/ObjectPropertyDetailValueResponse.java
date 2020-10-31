package ntk.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.object.entity.ObjectPropertyDetailValue;

public class ObjectPropertyDetailValueResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectPropertyDetailValue> ListItems;

    @SerializedName("Item")
    public ObjectPropertyDetailValue Item;
}

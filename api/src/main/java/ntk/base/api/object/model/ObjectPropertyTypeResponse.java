package ntk.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.object.entity.ObjectPropertyType;

public class ObjectPropertyTypeResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectPropertyType> ListItems;

    @SerializedName("Item")
    public ObjectPropertyType Item;
}

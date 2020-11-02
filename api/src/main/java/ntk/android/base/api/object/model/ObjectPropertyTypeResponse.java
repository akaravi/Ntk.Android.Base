package ntk.android.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.object.entity.ObjectPropertyType;

public class ObjectPropertyTypeResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectPropertyType> ListItems;

    @SerializedName("Item")
    public ObjectPropertyType Item;
}

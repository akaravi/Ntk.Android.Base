package ntk.android.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.object.entity.ObjectProperty;

public class ObjectPropertyResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectProperty> ListItems;

    @SerializedName("Item")
    public ObjectProperty Item;
}

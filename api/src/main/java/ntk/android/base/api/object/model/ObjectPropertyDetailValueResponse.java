package ntk.android.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.object.entity.ObjectPropertyDetailValue;

public class ObjectPropertyDetailValueResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectPropertyDetailValue> ListItems;

    @SerializedName("Item")
    public ObjectPropertyDetailValue Item;
}

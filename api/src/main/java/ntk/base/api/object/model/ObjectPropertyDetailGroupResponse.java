package ntk.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.object.entity.ObjectPropertyDetail;
import ntk.base.api.object.entity.ObjectPropertyDetailGroup;

public class ObjectPropertyDetailGroupResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectPropertyDetailGroup> ListItems;

    @SerializedName("Item")
    public ObjectPropertyDetailGroup Item;
}

package ntk.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.object.entity.ObjectGroup;

public class ObjectGroupResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectGroup> ListItems;

    @SerializedName("Item")
    public ObjectGroup Item;
}

package ntk.android.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.object.entity.ObjectGroup;

public class ObjectGroupResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectGroup> ListItems;

    @SerializedName("Item")
    public ObjectGroup Item;
}

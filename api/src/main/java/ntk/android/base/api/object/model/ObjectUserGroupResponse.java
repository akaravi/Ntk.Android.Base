package ntk.android.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.object.entity.ObjectUserGroup;

public class ObjectUserGroupResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectUserGroup> ListItems;

    @SerializedName("Item")
    public ObjectUserGroup Item;
}

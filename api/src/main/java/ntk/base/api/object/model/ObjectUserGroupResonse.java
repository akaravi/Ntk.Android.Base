package ntk.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.object.entity.ObjectUser;
import ntk.base.api.object.entity.ObjectUserGroup;

public class ObjectUserGroupResonse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectUserGroup> ListItems;

    @SerializedName("Item")
    public ObjectUserGroup Item;
}

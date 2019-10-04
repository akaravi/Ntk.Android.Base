package ntk.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.object.entity.ObjectGroup;
import ntk.base.api.object.entity.ObjectUser;

public class ObjectUserResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectUser> ListItems;

    @SerializedName("Item")
    public ObjectUser Item;
}

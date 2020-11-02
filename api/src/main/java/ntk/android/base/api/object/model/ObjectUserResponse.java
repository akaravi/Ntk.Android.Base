package ntk.android.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.object.entity.ObjectUser;

public class ObjectUserResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectUser> ListItems;

    @SerializedName("Item")
    public ObjectUser Item;
}

package ntk.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.object.entity.ObjectUser;
import ntk.base.api.object.entity.ObjectUserSite;

public class ObjectUserSiteResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectUserSite> ListItems;

    @SerializedName("Item")
    public ObjectUserSite Item;
}

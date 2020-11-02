package ntk.android.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.object.entity.ObjectUserSite;

public class ObjectUserSiteResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectUserSite> ListItems;

    @SerializedName("Item")
    public ObjectUserSite Item;
}

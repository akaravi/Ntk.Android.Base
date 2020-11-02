package ntk.android.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.object.entity.ObjectPropertySite;

public class ObjectPropertySiteResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectPropertySite> ListItems;

    @SerializedName("Item")
    public ObjectPropertySite Item;
}

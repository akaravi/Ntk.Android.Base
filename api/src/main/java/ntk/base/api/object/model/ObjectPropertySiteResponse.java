package ntk.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.object.entity.ObjectProperty;
import ntk.base.api.object.entity.ObjectPropertySite;

public class ObjectPropertySiteResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectPropertySite> ListItems;

    @SerializedName("Item")
    public ObjectPropertySite Item;
}

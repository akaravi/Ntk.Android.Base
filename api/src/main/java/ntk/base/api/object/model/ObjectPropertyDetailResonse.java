package ntk.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.object.entity.ObjectProperty;
import ntk.base.api.object.entity.ObjectPropertyDetail;

public class ObjectPropertyDetailResonse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectPropertyDetail> ListItems;

    @SerializedName("Item")
    public ObjectPropertyDetail Item;
}

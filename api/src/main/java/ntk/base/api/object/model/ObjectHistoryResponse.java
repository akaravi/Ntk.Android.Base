package ntk.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.object.entity.ObjectHistory;

public class ObjectHistoryResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectHistory> ListItems;

    @SerializedName("Item")
    public ObjectHistory Item;
}

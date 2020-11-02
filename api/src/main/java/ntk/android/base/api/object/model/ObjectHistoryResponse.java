package ntk.android.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.object.entity.ObjectHistory;

public class ObjectHistoryResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectHistory> ListItems;

    @SerializedName("Item")
    public ObjectHistory Item;
}

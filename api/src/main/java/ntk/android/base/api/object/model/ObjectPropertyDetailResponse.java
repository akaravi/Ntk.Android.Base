package ntk.android.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.object.entity.ObjectPropertyDetail;

public class ObjectPropertyDetailResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectPropertyDetail> ListItems;

    @SerializedName("Item")
    public ObjectPropertyDetail Item;
}

package ntk.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.object.viewModel.ObjectGroup;

public class ObjectGroupResonse  extends ErrorException {
    @SerializedName("ListItems")
    public List<ObjectGroup> ListItems;

    @SerializedName("Item")
    public ObjectGroup Item;
}

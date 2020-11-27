package ntk.android.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.core.entity.CoreLocationPrev;

public class CoreLocationResponse extends ErrorExceptionPrev {
    @SerializedName("ListItems")
    public List<CoreLocationPrev> ListItems;

    @SerializedName("Item")
    public CoreLocationPrev Item;
}

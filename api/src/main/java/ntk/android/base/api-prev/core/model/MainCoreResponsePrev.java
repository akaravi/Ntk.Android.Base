package ntk.android.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.core.entity.CoreMainPrev;

public class MainCoreResponsePrev extends ErrorExceptionPrev {

    @SerializedName("Item")
    public CoreMainPrev Item;
}

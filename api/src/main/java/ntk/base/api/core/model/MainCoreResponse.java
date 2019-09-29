package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.core.viewModel.CoreMain;

public class MainCoreResponse extends ErrorException {

    @SerializedName("Item")
    public CoreMain Item;
}

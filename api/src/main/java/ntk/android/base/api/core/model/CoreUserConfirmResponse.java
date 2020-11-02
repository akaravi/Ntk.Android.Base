package ntk.android.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.core.entity.ActivateCodeModel;

public class CoreUserConfirmResponse extends ErrorException {

    @SerializedName("Item")
    public ActivateCodeModel Item;
}

package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.core.entity.ActivateCodeModel;

public class CoreUserConfirmResponse extends ErrorException {

    @SerializedName("Item")
    public ActivateCodeModel Item;
}

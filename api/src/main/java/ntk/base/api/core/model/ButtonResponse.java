package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ButtonResponse extends ErrorException {

    @SerializedName("Buttons")
    public List<ButtonInfo> Buttons;
}

package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.core.entity.CoreAbout;

public class CoreAboutUsResponse extends ErrorException {

    @SerializedName("Item")
    public CoreAbout Item;
}
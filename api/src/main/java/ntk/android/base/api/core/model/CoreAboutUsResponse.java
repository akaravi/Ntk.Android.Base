package ntk.android.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.core.entity.CoreAbout;

public class CoreAboutUsResponse extends ErrorException {

    @SerializedName("Item")
    public CoreAbout Item;
}
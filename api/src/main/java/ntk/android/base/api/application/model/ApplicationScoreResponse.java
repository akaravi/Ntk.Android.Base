package ntk.android.base.api.application.model;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.ErrorException;

public class ApplicationScoreResponse extends ErrorException {

    @SerializedName("Title")
    public String Title;
}

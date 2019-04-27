package ntk.base.api.application.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.ErrorException;

public class ApplicationScoreResponse extends ErrorException {

    @SerializedName("Title")
    public String Title;
}

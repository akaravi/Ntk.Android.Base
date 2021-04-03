package ntk.android.base.api.application.model;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;

public class PrevApplicationScoreResponse extends ErrorExceptionPrev {

    @SerializedName("Title")
    public String Title;
}

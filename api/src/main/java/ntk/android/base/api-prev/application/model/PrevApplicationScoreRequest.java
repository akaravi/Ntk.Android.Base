package ntk.android.base.api.application.model;

import com.google.gson.annotations.SerializedName;

public class PrevApplicationScoreRequest {

    @SerializedName("ScoreComment")
    public String ScoreComment;

    @SerializedName("ScorePercent")
    public int ScorePercent;
}

package ntk.base.api.application.model;

import com.google.gson.annotations.SerializedName;

public class ApplicationScoreRequest {

    @SerializedName("ScoreComment")
    public String ScoreComment;

    @SerializedName("ScorePercent")
    public int ScorePercent;
}

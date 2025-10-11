package ntk.android.base.dtomodel.application;

import com.google.gson.annotations.SerializedName;

public class ApplicationScoreDtoModel {
    @SerializedName("LinkApiId")
    public long LinkApiId;
    @SerializedName("AppMemberId")
    public String AppMemberId;
    @SerializedName("ScoreComment")
    public String ScoreComment;
    @SerializedName("ScorePercent")
    public int ScorePercent;
}
package ntk.base.api.pooling.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseEntity;

public class PoolingOption  extends BaseEntity {

    @SerializedName("Option")
    public String Option;

    @SerializedName("OptionAnswer")
    public String OptionAnswer;

    @SerializedName("IsCorrectAnswer")
    public boolean IsCorrectAnswer;

    @SerializedName("NumberOfVotes")
    public int NumberOfVotes;

    @SerializedName("ScoreOfVotes")
    public int ScoreOfVotes;

    @SerializedName("LinkPollingContentId")
    public Long LinkPollingContentId;

    @SerializedName("Id")
    public int Id;




}

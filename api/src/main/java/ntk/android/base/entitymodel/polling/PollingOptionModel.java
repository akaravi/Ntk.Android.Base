package ntk.android.base.entitymodel.polling;


import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class PollingOptionModel extends BaseModuleEntity<Long> {

    @SerializedName("Option")
    public String Option;
    @SerializedName("OptionAnswer")
    public String OptionAnswer;
    @SerializedName("IsCorrectAnswer")
    public boolean IsCorrectAnswer;
    @SerializedName("NumberOfVotes")
    public long NumberOfVotes;
    @SerializedName("ScoreOfVotes")
    public long ScoreOfVotes;
    @SerializedName("LinkPollingContentId")
    public long LinkPollingContentId;
    @SerializedName("Virtual_PollingContent")
    public PollingContentModel Virtual_PollingContent;
    @SerializedName("PollingContent")
    public PollingContentModel PollingContent;
}

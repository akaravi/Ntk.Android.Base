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
    @SerializedName(" virtual_PollingContent")
    public PollingContentModel  virtual_PollingContent;
    @SerializedName("PollingContent")
    public PollingContentModel PollingContent;
}

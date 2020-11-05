package ntk.android.base.entitymodel.polling;


import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class PollingOptionModel extends BaseModuleEntity<Long> {

    @SerializedName("option")
    public String option;
    @SerializedName("optionAnswer")
    public String optionAnswer;
    @SerializedName("isCorrectAnswer")
    public boolean isCorrectAnswer;
    @SerializedName("numberOfVotes")
    public long numberOfVotes;
    @SerializedName("scoreOfVotes")
    public long scoreOfVotes;
    @SerializedName("linkPollingContentId")
    public long linkPollingContentId;
    @SerializedName("virtual_PollingContent")
    public PollingContentModel virtual_PollingContent;
    @SerializedName("pollingContent")
    public PollingContentModel pollingContent;
}

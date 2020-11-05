package ntk.android.base.entitymodel.polling;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

class PollingVoteModel extends BaseModuleEntity<Long> {
    @SerializedName("linkPollingContentId")
    public long linkPollingContentId;
    @SerializedName("linkPollingOptionId")
    public long linkPollingOptionId;
    @SerializedName("optionScore")
    public long optionScore;
    @SerializedName("deviceUserSerial")
    public String deviceUserSerial;
    @SerializedName("otherInfo")
    public String otherInfo;

}

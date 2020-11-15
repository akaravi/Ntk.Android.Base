package ntk.android.base.entitymodel.polling;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class PollingVoteModel extends BaseModuleEntity<Long> {
    @SerializedName("LinkPollingContentId")
    public long LinkPollingContentId;
    @SerializedName("LinkPollingOptionId")
    public long LinkPollingOptionId;
    @SerializedName("OptionScore")
    public long OptionScore;
    @SerializedName("DeviceUserSerial")
    public String DeviceUserSerial;
    @SerializedName("OtherInfo")
    public String OtherInfo;

}

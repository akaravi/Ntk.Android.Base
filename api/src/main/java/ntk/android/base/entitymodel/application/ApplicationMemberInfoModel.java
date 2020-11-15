package ntk.android.base.entitymodel.application;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;
import ntk.android.base.entitymodel.enums.EnumDeviceStatus;

class ApplicationMemberInfoModel extends BaseModuleEntity<Long> {

    @SerializedName("LinkUserId")
    public Long LinkUserId;
    @SerializedName("LinkMemberId")
    public Long LinkMemberId;
    @SerializedName("DeviceStatus")
    public EnumDeviceStatus DeviceStatus;
    @SerializedName("DeviceId")
    public String DeviceId;
    @SerializedName("DeviceBrand")
    public String DeviceBrand;
    @SerializedName("SimCard")
    public String SimCard;
    @SerializedName("Country")
    public String Country;
    @SerializedName("Language")
    public String Language;
    @SerializedName("NotificationId")
    public String NotificationId;
    @SerializedName("LinkApplicationId")
    public Long LinkApplicationId;
    @SerializedName("Application")
    public ApplicationAppModel Application;
    @SerializedName("AppBuildVer")
    public long AppBuildVer;
    @SerializedName("AppSourceVer")
    public String AppSourceVer;
    @SerializedName("DeviceIP")
    public String DeviceIP;
    @SerializedName("LocationLat")
    public String LocationLat;
    @SerializedName("LocationLong")
    public String LocationLong;
    @SerializedName("ScorePercent")
    public long ScorePercent;
    @SerializedName("ScoreComment")
    public String ScoreComment;
}

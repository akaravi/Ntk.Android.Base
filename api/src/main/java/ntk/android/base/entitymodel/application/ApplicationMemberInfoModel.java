package ntk.android.base.entitymodel.application;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

class ApplicationMemberInfoModel extends BaseModuleEntity<Long> {

    @SerializedName("linkUserId")
    public Long linkUserId;
    @SerializedName("linkMemberId")
    public Long linkMemberId;
    @SerializedName("deviceStatus")
    public EnumDeviceStatus deviceStatus;
    @SerializedName("deviceId")
    public String deviceId;
    @SerializedName("deviceBrand")
    public String deviceBrand;
    @SerializedName("simCard")
    public String simCard;
    @SerializedName("country")
    public String country;
    @SerializedName("language")
    public String language;
    @SerializedName("notificationId")
    public String notificationId;
    @SerializedName("linkApplicationId")
    public Long linkApplicationId;
    @SerializedName("application")
    public ApplicationAppModel application;
    @SerializedName("appBuildVer")
    public long appBuildVer;
    @SerializedName("appSourceVer")
    public String appSourceVer;
    @SerializedName("deviceIP")
    public String deviceIP;
    @SerializedName("locationLat")
    public String locationLat;
    @SerializedName("locationLong")
    public String locationLong;
    @SerializedName("scorePercent")
    public long scorePercent;
    @SerializedName("scoreComment")
    public String scoreComment;
}

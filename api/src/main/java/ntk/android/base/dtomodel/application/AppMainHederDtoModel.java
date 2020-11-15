package ntk.android.base.dtomodel.application;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.enums.EnumDeviceStatus;

class AppMainHederDtoModel {

    @SerializedName("DeviceId")
    public String DeviceId;
    @SerializedName("DeviceBrand")
    public String DeviceBrand;
    @SerializedName("NotificationId")
    public String NotificationId;
    @SerializedName("DeviceIP")
    public String DeviceIP;
    @SerializedName("LocationLong")
    public String LocationLong;
    @SerializedName("LocationLat")
    public String LocationLat;
    @SerializedName("Country")
    public String Country;
    @SerializedName("DeviceStatus")
    public EnumDeviceStatus DeviceStatus;
    @SerializedName("SimCard")
    public String SimCard;
    @SerializedName("Language")
    public String Language;
    @SerializedName("AppSourceVer")
    public String AppSourceVer;
    @SerializedName("AppBuildVer")
    public long AppBuildVer;
    @SerializedName("PackageName")
    public String PackageName;
    @SerializedName("Layout")
    public String Layout;
    @SerializedName("Token")
    public String Token;
}

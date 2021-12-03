package ntk.android.base.dtomodel.core;

import com.google.gson.annotations.SerializedName;

public class TokenDeviceClientInfoDtoModel {
    @SerializedName("SecurityKey")
    public String SecurityKey;
    @SerializedName("ClientMACAddress")
    public String ClientMACAddress;
    @SerializedName("OSType")
    public int OSType;
    @SerializedName("DeviceType")
    public int DeviceType;
    @SerializedName("PackageName")
    public String PackageName;
    @SerializedName("NotificationId")
    public String NotificationId;
    @SerializedName("AppBuildVer")
    public int AppBuildVer;
    @SerializedName("AppSourceVer")
    public String AppSourceVer;
    @SerializedName("Country")
    public String Country;
    @SerializedName("LocationLat")
    public String LocationLat;
    @SerializedName("LocationLong")
    public String LocationLong;
    @SerializedName("SimCard")
    public String SimCard;
    @SerializedName("Language")
    public String Language;
    @SerializedName("DeviceBrand")
    public String DeviceBrand;
 
}

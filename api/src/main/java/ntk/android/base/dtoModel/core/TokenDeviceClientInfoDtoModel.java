package ntk.android.base.dtoModel.core;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.enums.EnumDeviceType;
import ntk.android.base.enums.EnumOperatingSystemType;

public class TokenDeviceClientInfoDtoModel {
    @SerializedName("SecurityKey")
  public   String SecurityKey;
    @SerializedName("ClientMACAddress")
    public String ClientMACAddress;
    @SerializedName("OSType")
    public   EnumOperatingSystemType OSType;
    @SerializedName("DeviceType")
    public    EnumDeviceType DeviceType;
    @SerializedName("PackageName")
    public   String PackageName;
}

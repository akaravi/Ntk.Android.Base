package ntk.android.base.dtomodel.core;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.enums.EnumDeviceType;
import ntk.android.base.entitymodel.enums.EnumOperatingSystemType;

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

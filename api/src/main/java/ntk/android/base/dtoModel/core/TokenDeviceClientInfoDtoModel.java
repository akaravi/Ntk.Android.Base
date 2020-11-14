package ntk.android.base.dtomodel.core;

import com.google.gson.annotations.SerializedName;

public class TokenDeviceClientInfoDtoModel {
    @SerializedName("SecurityKey")
  public   String SecurityKey;
    @SerializedName("ClientMACAddress")
    public String ClientMACAddress;
    @SerializedName("OSType")
    public   int OSType;
    @SerializedName("DeviceType")
    public    int DeviceType;
    @SerializedName("PackageName")
    public   String PackageName;
}

package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreDeviceModel extends BaseEntity<Long> {
    @SerializedName("securityKey")
    public String securityKey;
    @SerializedName("ExpireDate")
    public String ExpireDate;
    @SerializedName("Description")
    public String Description;
    @SerializedName("OSType")
    public int OSType;//as EnumOperatingSystemType
    @SerializedName("DeviceType")
    public int DeviceType;//as EnumDeviceType
    @SerializedName("PackageName")
    public String PackageName;
    @SerializedName("DeviceIPsAllow")
    public String DeviceIPsAllow;
    @SerializedName("LinkApplicationId")
    public long LinkApplicationId;
    @SerializedName("LinkSiteId")
    public long LinkSiteId;// tslint:disable-next-line: variable-name
    @SerializedName(" virtual_CmsSite")
    public CoreSiteModel  virtual_CmsSite;
    @SerializedName("CmsSite")
    public CoreSiteModel CmsSite;
}


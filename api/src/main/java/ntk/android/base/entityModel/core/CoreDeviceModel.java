package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreDeviceModel extends BaseEntity<Long> {
    @SerializedName("securityKey")
    public String securityKey;
    @SerializedName("expireDate")
    public String expireDate;
    @SerializedName("description")
    public String description;
    @SerializedName("oSType")
    public int oSType;//as EnumOperatingSystemType
    @SerializedName("deviceType")
    public int deviceType;//as EnumDeviceType
    @SerializedName("packageName")
    public String packageName;
    @SerializedName("deviceIPsAllow")
    public String deviceIPsAllow;
    @SerializedName("linkApplicationId")
    public long linkApplicationId;
    @SerializedName("LinkSiteId")
    public long LinkSiteId;// tslint:disable-next-line: variable-name
    @SerializedName("virtual_CmsSite")
    public CoreSiteModel virtual_CmsSite;
    @SerializedName("cmsSite")
    public CoreSiteModel cmsSite;
}


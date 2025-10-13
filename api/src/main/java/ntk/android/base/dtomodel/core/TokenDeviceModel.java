package ntk.android.base.dtomodel.core;

import com.google.gson.annotations.SerializedName;

public class TokenDeviceModel{
    @SerializedName("LinkSiteId")
    public   int LinkSiteId;
    @SerializedName("LinkDeviceId")
    public   int LinkDeviceId;
    @SerializedName("LinkApplicationId")
    public   int LinkApplicationId;

    @SerializedName("RememberOnDevice")
    public boolean RememberOnDevice;

    @SerializedName("CurrentSiteDomainUrl")
    public String CurrentSiteDomainUrl;
    @SerializedName("DeviceToken")
    public String DeviceToken;

    @SerializedName("tokenExpireDate")
    public String tokenExpireDate;
}
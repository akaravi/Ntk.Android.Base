package ntk.base.api.linkManagemen.model;

import com.google.gson.annotations.SerializedName;

public class LinkManagementTargetActShortLinkSetResponce {

    @SerializedName("Id")
    public long Id;
    @SerializedName("Key")
    public String Key;
    @SerializedName("ShareExpireDate")
    public String ShareExpireDate ;
    @SerializedName("ShortLinkUrl")
    public String ShortLinkUrl ;
}

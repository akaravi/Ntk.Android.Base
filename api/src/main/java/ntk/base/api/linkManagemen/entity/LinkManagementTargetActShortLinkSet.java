package ntk.base.api.linkManagemen.entity;

import com.google.gson.annotations.SerializedName;

public class LinkManagementTargetActShortLinkSet {
    @SerializedName("Key")
    public String Key;
    @SerializedName("ShareExpireDate")
    public String ShareExpireDate ;
    @SerializedName("ShortLinkUrl")
    public String ShortLinkUrl ;

    @SerializedName("ShortLinkQRCodeBase64")
    public String ShortLinkQRCodeBase64 ;
}

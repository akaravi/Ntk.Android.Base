package ntk.base.api.linkManagemen.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LinkManagementTargetActShortLinkGet {
    @SerializedName("Key")
    public String Key;

    @SerializedName("UrlAddress")
    public String UrlAddress;

    @SerializedName("Description")
    public String Description;

    @SerializedName("FileSrc")
    public List<String> FilesSrc;

    @SerializedName("ShareExpireDate")
    public String ShareExpireDate;

    @SerializedName("ShortLinkUrl")
    public String ShortLinkUrl;

    @SerializedName("ShortLinkQRCodeBase64")
    public String ShortLinkQRCodeBase64;
}

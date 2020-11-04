package ntk.android.base.dtomodel.linkManagement;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LinkManagementTargetShortLinkGetResponceModel {
    @SerializedName("Key")
    String Key;
    @SerializedName("FilesSrc")
    List<String> FilesSrc;
    @SerializedName("Description")
    String Description;
    @SerializedName("UrlAddress")
    String UrlAddress;
    @SerializedName("ShareExpireDate")
    String ShareExpireDate;
    @SerializedName("ShortLinkUrl")
    String ShortLinkUrl;
    @SerializedName("ShortLinkQRCodeBase64")
    String ShortLinkQRCodeBase64;
}

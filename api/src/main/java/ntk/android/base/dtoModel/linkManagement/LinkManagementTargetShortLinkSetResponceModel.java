package ntk.android.base.dtomodel.linkManagement;

import com.google.gson.annotations.SerializedName;

public class LinkManagementTargetShortLinkSetResponceModel {
    @SerializedName("Key")
    String Key;
    @SerializedName("ShareExpireDate")
    String ShareExpireDate;
    @SerializedName("ShortLinkUrl")
    String ShortLinkUrl;
    @SerializedName("ShortLinkQRCodeBase64")
    String ShortLinkQRCodeBase64;
}

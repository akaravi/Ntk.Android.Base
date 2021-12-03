package ntk.android.base.dtomodel.linkManagement;

import com.google.gson.annotations.SerializedName;

public class LinkManagementTargetShortLinkSetDtoModel {
    @SerializedName("CaptchaKey")
    String CaptchaKey;
    @SerializedName("CaptchaText")
    String CaptchaText;
    @SerializedName("UrlAddress")
    String UrlAddress;
    @SerializedName("Description")
    String Description;
    @SerializedName("UploadFileKey")
    String UploadFileKey;
}

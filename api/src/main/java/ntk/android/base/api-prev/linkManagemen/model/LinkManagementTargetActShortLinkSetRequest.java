package ntk.android.base.api.linkManagemen.model;

import com.google.gson.annotations.SerializedName;

public class LinkManagementTargetActShortLinkSetRequest {
    @SerializedName("CaptchaKey")
    public String CaptchaKey ;
    @SerializedName("CaptchaText")
    public String CaptchaText ;

    @SerializedName("UrlAddress")
    public String UrlAddress;

    @SerializedName("Description")
    public String Description;

    @SerializedName("UploadFileKey")
    public String UploadFileKey;
}

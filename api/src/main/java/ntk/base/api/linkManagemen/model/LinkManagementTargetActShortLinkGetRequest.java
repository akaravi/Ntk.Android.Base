package ntk.base.api.linkManagemen.model;

import com.google.gson.annotations.SerializedName;

public class LinkManagementTargetActShortLinkGetRequest {
    @SerializedName("CaptchaKey")
    public String CaptchaKey ;
    @SerializedName("CaptchaText")
    public String CaptchaText ;


    @SerializedName("Key")
    public String Key;
}

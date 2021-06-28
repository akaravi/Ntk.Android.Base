package ntk.android.base.api.core.model;

import com.google.gson.annotations.SerializedName;

public class CoreUserRegisterByMobileRequestPrev {
    @SerializedName("CaptchaKey")
    public String CaptchaKey ;
    @SerializedName("CaptchaText")
    public String CaptchaText ;

    @SerializedName("Mobile")
    public String Mobile;

    @SerializedName("Code")
    public String Code;
}

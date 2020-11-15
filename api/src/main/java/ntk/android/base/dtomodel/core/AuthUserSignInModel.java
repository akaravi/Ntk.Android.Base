package ntk.android.base.dtomodel.core;

import com.google.gson.annotations.SerializedName;

public class AuthUserSignInModel {
    @SerializedName("CaptchaKey")
    String captchaKey;
    @SerializedName("CaptchaText")
    String captchaText;
    @SerializedName("Email")
    String Email;
    @SerializedName("Password")
    String Password;
    @SerializedName("IsRemember")
    boolean IsRemember;
    @SerializedName("SiteId")
    int SiteId;
    @SerializedName("Lang")
    String lang;
}

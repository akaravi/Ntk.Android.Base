package ntk.android.base.dtomodel.core;

import com.google.gson.annotations.SerializedName;

public class AuthUserSignInModel {
    @SerializedName("CaptchaKey")
    public String captchaKey;
    @SerializedName("CaptchaText")
    public String captchaText;
    @SerializedName("Email")
    public String Email;  
    @SerializedName("Mobile")
    public String Mobile;
    @SerializedName("Password")
    public String Password;
    @SerializedName("IsRemember")
    public boolean IsRemember;
    @SerializedName("SiteId")
    public long SiteId;
    @SerializedName("Lang")
    public String lang;
}

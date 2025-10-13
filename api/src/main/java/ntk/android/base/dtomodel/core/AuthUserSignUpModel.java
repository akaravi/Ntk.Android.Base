package ntk.android.base.dtomodel.core;

import com.google.gson.annotations.SerializedName;

public class AuthUserSignUpModel {
    @SerializedName("CaptchaKey")
    public String CaptchaKey;
    @SerializedName("CaptchaText")
    public String CaptchaText;
    @SerializedName("Email")
    public String Email;
    @SerializedName("Mobile")
    public String Mobile;
    @SerializedName("Password")
    public String Password;
    @SerializedName("RePassword")
    public String RePassword;
    @SerializedName("Name")
    public String Name;
    @SerializedName("Family")
    public String family;
    @SerializedName("SiteId")
    public int SiteId;
    @SerializedName("Roulaccespt")
    public boolean Roulaccespt;
}

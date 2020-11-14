package ntk.android.base.dtomodel.core;

import com.google.gson.annotations.SerializedName;

public class AuthUserSignUpModel {
    @SerializedName("captchaKey")
    public String captchaKey;
    @SerializedName("captchaText")
    public String captchaText;
    @SerializedName("email")
    public String email;
    @SerializedName("mobile")
    public String mobile;
    @SerializedName("Password")
    public String Password;
    @SerializedName("rePassword")
    public String rePassword;
    @SerializedName("name")
    public String name;
    @SerializedName("family")
    public String family;
    @SerializedName("SiteId")
    public int SiteId;
    @SerializedName("roulaccespt")
    public boolean roulaccespt;
}

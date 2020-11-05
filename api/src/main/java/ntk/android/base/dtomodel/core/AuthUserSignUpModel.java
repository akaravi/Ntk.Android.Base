package ntk.android.base.dtomodel.core;

import com.google.gson.annotations.SerializedName;

public class AuthUserSignUpModel {
    @SerializedName("captchaKey")
    String captchaKey;
    @SerializedName("captchaText")
    String captchaText;
    @SerializedName("email")
    String email;
    @SerializedName("mobile")
    String mobile;
    @SerializedName("Password")
    String Password;
    @SerializedName("rePassword")
    String rePassword;
    @SerializedName("name")
    String name;
    @SerializedName("family")
    String family;
    @SerializedName("SiteId")
    int SiteId;
    @SerializedName("roulaccespt")
    boolean roulaccespt;
}

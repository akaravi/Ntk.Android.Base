package ntk.android.base.dtomodel.core;

import com.google.gson.annotations.SerializedName;

public class AuthUserSignInModel {
    @SerializedName("captchaKey")
    String captchaKey;
    @SerializedName("captchaText")
    String captchaText;
    @SerializedName("Email")
    String Email;
    @SerializedName("Password")
    String Password;
    @SerializedName("IsRemember")
    boolean IsRemember;
    @SerializedName("SiteId")
    int SiteId;
    @SerializedName("lang")
    String lang;
}

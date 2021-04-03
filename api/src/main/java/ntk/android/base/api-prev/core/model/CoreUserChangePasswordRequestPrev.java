package ntk.android.base.api.core.model;

import com.google.gson.annotations.SerializedName;

public class CoreUserChangePasswordRequestPrev {
    @SerializedName("CaptchaKey")
    public String CaptchaKey ;
    @SerializedName("CaptchaText")
    public String CaptchaText ;

    @SerializedName("OldPassword")
    public String OldPassword;

    @SerializedName("Password")
    public String Password;

    @SerializedName("RePassword")
    public String RePassword;
}

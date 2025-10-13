package ntk.android.base.dtomodel.core;

import com.google.gson.annotations.SerializedName;

public class AuthUserForgetPasswordModel {
    @SerializedName("CaptchaKey")
    public String CaptchaKey;
    @SerializedName("CaptchaText")
    public String CaptchaText;
    @SerializedName("Email")
    public String Email;
    @SerializedName("Mobile")
    public String Mobile;
}

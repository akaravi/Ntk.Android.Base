package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

public class AuthUserForgetPasswordModel {
    @SerializedName("captchaKey")
    String captchaKey;
    @SerializedName("captchaText")
    String captchaText;
    @SerializedName("email")
    String email;
}

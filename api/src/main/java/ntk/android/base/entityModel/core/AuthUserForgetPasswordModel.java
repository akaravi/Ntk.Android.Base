package ntk.android.base.entityModel.core;

import com.google.gson.annotations.SerializedName;

class AuthUserForgetPasswordModel {
    @SerializedName("") String captchaKey;
    @SerializedName("")   String captchaText;
    @SerializedName("")    String email;
}

package ntk.android.base.entityModel.core;

import com.google.gson.annotations.SerializedName;

class AuthUserSignUpModel {
    @SerializedName("") String captchaKey;
    @SerializedName("")  String captchaText;
    @SerializedName("")   String email;
    @SerializedName("")   String mobile;
    @SerializedName("")    String Password;
    @SerializedName("")    String rePassword;
    @SerializedName("")   String name;
    @SerializedName("")   String family;
    @SerializedName("")  int SiteId;
    @SerializedName("")    boolean roulaccespt;
}

package ntk.android.base.entityModel.core;

import com.google.gson.annotations.SerializedName;

class AuthUserSignInModel {
    @SerializedName("")  String captchaKey;
    @SerializedName("")   String captchaText;
    @SerializedName("")    String  Email;
    @SerializedName("")    String  Password;
    @SerializedName("")    boolean  IsRemember;
    @SerializedName("")    int SiteId;
    @SerializedName("")    String lang;
}

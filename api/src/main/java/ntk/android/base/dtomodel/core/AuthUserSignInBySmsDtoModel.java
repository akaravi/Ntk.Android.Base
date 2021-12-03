package ntk.android.base.dtomodel.core;

import com.google.gson.annotations.SerializedName;

public class AuthUserSignInBySmsDtoModel {
    @SerializedName("CaptchaKey")
    public String CaptchaKey;
    @SerializedName("CaptchaText")
    public String CaptchaText;
    @SerializedName("Mobile")
    public String Mobile;
    @SerializedName("Code")
    public String Code;
    @SerializedName("IsRemember")
    public boolean IsRemember;
    @SerializedName("SiteId")
    public long SiteId;
    @SerializedName("lang")
    public String lang;
}

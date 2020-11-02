package ntk.android.base.api.core.model;

import com.google.gson.annotations.SerializedName;

public class CoreUserLoginRequest {

    @SerializedName("CaptchaKey")
    public String CaptchaKey ;
    @SerializedName("CaptchaText")
    public String CaptchaText ;

    @SerializedName("Username")
    public String Username;

    @SerializedName("Password")
    public String Password;

    @SerializedName("lang")
    public String lang;
}

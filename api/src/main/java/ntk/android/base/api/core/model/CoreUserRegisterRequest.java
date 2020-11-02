package ntk.android.base.api.core.model;

import com.google.gson.annotations.SerializedName;

public class CoreUserRegisterRequest {

    @SerializedName("CaptchaKey")
    public String CaptchaKey ;
    @SerializedName("CaptchaText")
    public String CaptchaText ;

    @SerializedName("Username")
    public String Username;

    @SerializedName("Password")
    public String Password;

    @SerializedName("Name")
    public String Name;

    @SerializedName("Phone")
    public String Phone;

    @SerializedName("RePassword")
    public String RePassword;

    @SerializedName("FullName")
    public String FullName;

    @SerializedName("LastName")
    public String LastName;
}

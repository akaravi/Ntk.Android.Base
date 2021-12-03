package ntk.android.base.dtomodel.core;

import com.google.gson.annotations.SerializedName;

public class AuthEmailConfirmDtoModel {
    @SerializedName("CaptchaKey")
    public String CaptchaKey;
    @SerializedName("CaptchaText")
    public String CaptchaText;
    @SerializedName("LinkUserId")
    public Long LinkUserId;
    @SerializedName("Mobile")
    public String Mobile;
    @SerializedName("Code")
    public String Code;
}
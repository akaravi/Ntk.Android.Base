package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

public class CoreUserConfirmEmailRequest {
    @SerializedName("CaptchaKey")
    public String CaptchaKey ;
    @SerializedName("CaptchaText")
    public String CaptchaText ;

    @SerializedName("Email")
    public String Email;

    @SerializedName("Code")
    public String Code;
}

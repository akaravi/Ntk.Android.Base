package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.core.entity.ActivateCodeModel;

public class CoreUserConfirmMobileRequest {
    @SerializedName("CaptchaKey")
    public String CaptchaKey ;
    @SerializedName("CaptchaText")
    public String CaptchaText ;

    @SerializedName("Mobile")
    public String Mobile;

    @SerializedName("Code")
    public String Code;

}

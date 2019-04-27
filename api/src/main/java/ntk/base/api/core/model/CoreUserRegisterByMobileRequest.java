package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

public class CoreUserRegisterByMobileRequest {

    @SerializedName("Mobile")
    public String Mobile;

    @SerializedName("Code")
    public String Code;
}

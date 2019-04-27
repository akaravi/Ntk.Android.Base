package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

public class CoreUserMobileConfirmRequest {

    @SerializedName("Mobile")
    public String Mobile;

    @SerializedName("Code")
    public String Code;
}

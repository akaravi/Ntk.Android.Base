package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

public class CoreUserEmailConfirmRequest {

    @SerializedName("Email")
    public String Email;

    @SerializedName("Code")
    public String Code;
}

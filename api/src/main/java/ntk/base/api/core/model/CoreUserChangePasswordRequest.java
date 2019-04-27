package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

public class CoreUserChangePasswordRequest {
    @SerializedName("OldPassword")
    public String OldPassword;

    @SerializedName("Password")
    public String Password;

    @SerializedName("RePassword")
    public String RePassword;
}

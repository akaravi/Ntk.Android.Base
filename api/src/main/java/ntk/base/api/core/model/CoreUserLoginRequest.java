package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

public class CoreUserLoginRequest {

    @SerializedName("Username")
    public String Username;

    @SerializedName("Password")
    public String Password;

    @SerializedName("lang")
    public String lang;
}

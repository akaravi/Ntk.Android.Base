package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.ErrorException;

public class CoreResponse extends ErrorException {

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("Username")
    public String Username;

    @SerializedName("Gender")
    public int Gender;

    @SerializedName("Email")
    public String Email;

    @SerializedName("Mobile")
    public String Mobile;

    @SerializedName("EmailConfirmed")
    public Boolean EmailConfirmed;
}

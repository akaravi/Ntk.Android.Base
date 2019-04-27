package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

public class CoreUserForgetPasswordRequest {

    @SerializedName("ActionOrder") //TODO >>>
    public int ActionOrder;

    @SerializedName("Mobile")
    public String Mobile;

    @SerializedName("Email")
    public String Email;

    @SerializedName("Code")
    public String Code;

    @SerializedName("NewPassword")
    public String NewPassword;
}

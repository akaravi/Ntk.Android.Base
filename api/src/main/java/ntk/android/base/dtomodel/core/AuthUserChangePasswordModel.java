package ntk.android.base.dtomodel.core;

import com.google.gson.annotations.SerializedName;

public class AuthUserChangePasswordModel {
    @SerializedName("OldPassword")
    public  String OldPassword;
    @SerializedName("NewPassword")
    public  String NewPassword;
}

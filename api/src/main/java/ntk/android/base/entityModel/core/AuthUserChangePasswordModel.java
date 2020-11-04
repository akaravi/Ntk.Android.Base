package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

public class AuthUserChangePasswordModel {
    @SerializedName("OldPassword")
    String OldPassword;
    @SerializedName("NewPassword")
    String NewPassword;
}

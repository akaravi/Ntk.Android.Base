package ntk.android.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

public class ActivateCodeModel {

    @SerializedName("Mobile")
    public String Mobile ;
    @SerializedName("Email")
    public String Email ;
    @SerializedName("Title")
    public int ConfirmAccountType ;
}

package ntk.android.base.entitymodel.coretoken;

import com.google.gson.annotations.SerializedName;

public class CoreTokenUserBadLoginModel extends UserTokenModel {
    @SerializedName("deviceId")
    public String deviceId;
    @SerializedName("requestDate")
    public String requestDate;
    @SerializedName("usedUsername")
    public String usedUsername;
    @SerializedName("usedPwd")
    public String usedPwd;

}

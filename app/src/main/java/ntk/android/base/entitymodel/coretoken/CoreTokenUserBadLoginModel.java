package ntk.android.base.entitymodel.coretoken;

import com.google.gson.annotations.SerializedName;

public class CoreTokenUserBadLoginModel extends UserTokenModel {
    @SerializedName("DeviceId")
    public String DeviceId;
    @SerializedName("RequestDate")
    public String RequestDate;
    @SerializedName("UsedUsername")
    public String UsedUsername;
    @SerializedName("UsedPwd")
    public String UsedPwd;

}

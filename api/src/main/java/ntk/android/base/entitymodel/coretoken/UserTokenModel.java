package ntk.android.base.entitymodel.coretoken;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;
import ntk.android.base.entitymodel.enums.EnumManageUserAccessAreaTypes;
import ntk.android.base.entitymodel.enums.EnumManageUserAccessControllerTypes;

public class UserTokenModel extends BaseEntity<String> {

    @SerializedName("LinkUserId")
    public long LinkUserId;
    @SerializedName("LinkMemberUserId")
    public long LinkMemberUserId;
    @SerializedName("LinkSiteId")
    public long LinkSiteId;
    @SerializedName("DeviceClientMAC")
    public String DeviceClientMAC;
    @SerializedName("LinkDeviceId")
    public long LinkDeviceId;
    @SerializedName("Token")
    public String Token;
    @SerializedName("ExpireDate")
    public String ExpireDate;
    @SerializedName("UserAccessAreaType")
    public EnumManageUserAccessAreaTypes UserAccessAreaType;
    @SerializedName("UserType")
    public EnumManageUserAccessControllerTypes UserType;
    @SerializedName("UserAccessAdminAllowToAllData")
    public boolean UserAccessAdminAllowToAllData;
    @SerializedName("UserAccessAdminAllowToProfessionalData")
    public boolean UserAccessAdminAllowToProfessionalData;
    @SerializedName("RememberOnDevice")
    public boolean RememberOnDevice;
    @SerializedName("BrowserLanguage")
    public String BrowserLanguage;
    @SerializedName("UserLanguage")
    public int UserLanguage;


}

package ntk.android.base.entitymodel.coretoken;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;
import ntk.android.base.entitymodel.enums.EnumManageUserAccessAreaTypes;
import ntk.android.base.entitymodel.enums.EnumManageUserAccessControllerTypes;

public class CoreTokenLogModel extends BaseEntity<String> {


    @SerializedName("description")
    public String description;
    @SerializedName("linkUserId")
    public long linkUserId;
    @SerializedName("linkMemberUserId")
    public long linkMemberUserId;
    @SerializedName("linkSiteId")
    public long linkSiteId;
    @SerializedName("deviceClientMAC")
    public String deviceClientMAC;
    @SerializedName("linkDeviceId")
    public long linkDeviceId;
    @SerializedName("token")
    public String token;
    @SerializedName("expireDate")
    public String expireDate;
    @SerializedName("userAccessAreaType")
    public EnumManageUserAccessAreaTypes userAccessAreaType;
    @SerializedName("userType")
    public EnumManageUserAccessControllerTypes userType;
    @SerializedName("userAccessAdminAllowToAllData")
    public boolean userAccessAdminAllowToAllData;
    @SerializedName("userAccessAdminAllowToProfessionalData")
    public boolean userAccessAdminAllowToProfessionalData;
    @SerializedName("rememberOnDevice")
    public boolean rememberOnDevice;
    @SerializedName("browserLanguage")
    public String browserLanguage;
    @SerializedName("userLanguage")
    public long userLanguage;
}



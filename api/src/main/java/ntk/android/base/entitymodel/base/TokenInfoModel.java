package ntk.android.base.entitymodel.base;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.enums.EnumManageUserAccessAreaTypes;
import ntk.android.base.entitymodel.enums.EnumManageUserAccessControllerTypes;

public class TokenInfoModel {
    @SerializedName("Token")
    public String Token;
    @SerializedName("DeviceToken")
    public String DeviceToken;
    @SerializedName("RefreshToken")
    public String RefreshToken;
    @SerializedName("MemberId")
    public Long MemberId;
    @SerializedName("MemberUserId")
    public String MemberUserId;
    @SerializedName("UserId")
    public long UserId;
    @SerializedName("SiteId")
    public long SiteId;
    @SerializedName("UserGroupId")
    public long UserGroupId;
    @SerializedName("UserTypeTitle")
    public String UserTypeTitle;
    @SerializedName("UserAccessAdminAllowToProfessionalData")
    public boolean UserAccessAdminAllowToProfessionalData;
    @SerializedName("UserAccessAdminAllowToAllData")
    public boolean UserAccessAdminAllowToAllData;
    @SerializedName("UserType")
    public EnumManageUserAccessControllerTypes UserType;
    @SerializedName("UserAccessAreaType")
    public EnumManageUserAccessAreaTypes UserAccessAreaType;
    @SerializedName("Username")
    public String Username;
    @SerializedName("Name")
    public String Name;
    @SerializedName("LastName")
    public String LastName;
    @SerializedName("FullName")
    public String FullName;
    @SerializedName("Language")
    public String Language;
    @SerializedName("Domain")
    public String Domain;
    @SerializedName("SubDomain")
    public String SubDomain;
    @SerializedName("Title")
    public String Title;
    @SerializedName("PhotoUrl")
    public String PhotoUrl;
}

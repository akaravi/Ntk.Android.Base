package ntk.android.base.entitymodel.base;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.enums.EnumManageUserAccessAreaTypes;
import ntk.android.base.entitymodel.enums.EnumManageUserAccessControllerTypes;
import ntk.android.base.entitymodel.enums.EnumManageUserAccessUserTypes;

public class TokenInfoModel {
    @SerializedName("Token")
    public String Token;
    @SerializedName("DeviceToken")
    public String DeviceToken;
    @SerializedName("RefreshToken")
    public String RefreshToken;
    @SerializedName("TokenExpireDate")
    public String TokenExpireDate;
    @SerializedName("SiteId")
    public long SiteId;
    @SerializedName("UserId")
    public long UserId;
    @SerializedName("MemberId")
    public Long MemberId;
    @SerializedName("MemberUserId")
    public String MemberUserId;
    @SerializedName("DeviceId")
    public Long DeviceId;
    @SerializedName("ApplicationId")
    public Long ApplicationId;
    @SerializedName("UserGroupId")
    public long UserGroupId;
    @SerializedName("UserAccessAdminAllowToProfessionalData")
    public boolean UserAccessAdminAllowToProfessionalData;
    @SerializedName("UserAccessAdminAllowToAllData")
    public boolean UserAccessAdminAllowToAllData;
    @SerializedName("UserAccessUserType")//as EnumManageUserAccessUserTypes
    int UserAccessUserType;
    @SerializedName("UserAccessAreaType")//as EnumManageUserAccessAreaTypes
    int UserAccessAreaType;
    @SerializedName("UserAccessUserTypeTitle")
    public String UserAccessUserTypeTitle;
    @SerializedName("UserAccessUserAreaTitle")
    public String UserAccessUserAreaTitle;
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
    @SerializedName("CurrentSiteDomainUrl")
    public String CurrentSiteDomainUrl;
    @SerializedName("Title")
    public String Title;
    @SerializedName("PhotoUrl")
    public String PhotoUrl;
    @SerializedName("Mobile")
    public String Mobile;
    @SerializedName("UserTypeTitle")
    public String UserTypeTitle;

}

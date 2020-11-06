package ntk.android.base.entitymodel.base;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.enums.EnumManageUserAccessAreaTypes;
import ntk.android.base.entitymodel.enums.EnumManageUserAccessControllerTypes;

public class TokenInfoModel {
    @SerializedName("Token")
    String Token;
    @SerializedName("DeviceToken")
    String DeviceToken;
    @SerializedName("RefreshToken")
    String RefreshToken;

    @SerializedName("UserId")
    long UserId;
    @SerializedName("SiteId")
    long SiteId;
    @SerializedName("UserGroupId")
    long UserGroupId;
    @SerializedName("UserTypeTitle")
    String UserTypeTitle;
    @SerializedName("UserAccessAdminAllowToProfessionalData")
    boolean UserAccessAdminAllowToProfessionalData;
    @SerializedName("UserAccessAdminAllowToAllData")
    boolean UserAccessAdminAllowToAllData;
    @SerializedName("UserType")
    EnumManageUserAccessControllerTypes UserType;
    @SerializedName("UserAccessAreaType")
    EnumManageUserAccessAreaTypes UserAccessAreaType;
    @SerializedName("Username")
    String Username;
    @SerializedName("Name")
    String Name;
    @SerializedName("LastName")
    String LastName;
    @SerializedName("FullName")
    String FullName;
    @SerializedName("Language")
    String Language;
    @SerializedName("Domain")
    String Domain;
    @SerializedName("SubDomain")
    String SubDomain;
    @SerializedName("Title")
    String Title;
    @SerializedName("PhotoUrl")
    String PhotoUrl;
}

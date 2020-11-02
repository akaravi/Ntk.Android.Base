package ntk.android.base.entityModel.core;

import com.google.gson.annotations.SerializedName;

public class TokenInfoModel {
    @SerializedName("token")
    public String token;
    @SerializedName("DeviceToken")
    public String DeviceToken;
    @SerializedName("RefreshToken")
    public String refresh_token;

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
    public int UserType;
    @SerializedName("UserAccessAreaType")
    public int UserAccessAreaType;
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

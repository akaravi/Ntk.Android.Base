package ntk.android.base.entitymodel.coremain;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreUserModel extends BaseEntity<Long> {
    @SerializedName("Username")
    public String Username;
    @SerializedName("Pwd")
    public String Pwd;
    @SerializedName("ExpireDate")
    public String ExpireDate;
    @SerializedName("Email")
    public String Email;
    @SerializedName("EmailConfirmed")
    public boolean EmailConfirmed;
    @SerializedName("Mobile")
    public String Mobile;
    @SerializedName("MobileConfirmed")
    public boolean MobileConfirmed;
    @SerializedName("ExpireLockAccount")
    public String ExpireLockAccount;
    @SerializedName("Name")
    public String Name;
    @SerializedName("LastName")
    public String LastName;
    @SerializedName("BirthDay")
    public String BirthDay;
    @SerializedName("Gender")
    public int Gender;
    @SerializedName("CompanyName")
    public String CompanyName;
    @SerializedName("Address")
    public String Address;
    @SerializedName("PostalCode")
    public String PostalCode;
    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;
    @SerializedName("LinkMainImageIdSrc")
    public String LinkMainImageIdSrc;
    @SerializedName("Tell")
    public String Tell;
    @SerializedName("IsCompany")
    public boolean IsCompany;
    @SerializedName("LinkLocationId")
    public Long LinkLocationId;
    @SerializedName("FirewallAllowIP")
    public String FirewallAllowIP;
    @SerializedName("LinkResellerSiteId")
    public Long LinkResellerSiteId;
    @SerializedName("LinkResellerUserId")
    public Long LinkResellerUserId;
    @SerializedName("LinkLocationIdTitle")
    public String LinkLocationIdTitle;
    @SerializedName("LinkLocationIdParentTitle")
    public String LinkLocationIdParentTitle;
}

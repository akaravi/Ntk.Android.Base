package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;
import ntk.android.base.entitymodel.enums.EnumGenderType;

public class CoreUserModel extends BaseEntity<Long> {
    @SerializedName("Username")
    String Username;
    @SerializedName("ExpireDate")
    String ExpireDate;
    @SerializedName("Email")
    String Email;
    @SerializedName("EmailConfirmed")
    boolean EmailConfirmed;
    @SerializedName("Mobile")
    String Mobile;
    @SerializedName("MobileConfirmed")
    boolean MobileConfirmed;
    @SerializedName("ExpireLockAccount")
    String ExpireLockAccount;
    @SerializedName("Name")
    String Name;
    @SerializedName("LastName")
    String LastName;
    @SerializedName("BirthDay")
    String BirthDay;
    @SerializedName("Gender")
    EnumGenderType Gender;
    @SerializedName("CompanyName")
    String CompanyName;
    @SerializedName("Address")
    String Address;
    @SerializedName("PostalCode")
    String PostalCode;
    @SerializedName("LinkMainImageId")
    long LinkMainImageId;
    @SerializedName("Tell")
    String Tell;
    @SerializedName("IsCompany")
    boolean IsCompany;
    @SerializedName("LinkLocationId")
    long LinkLocationId;
    @SerializedName("FirewallAllowIP")
    String FirewallAllowIP;
}

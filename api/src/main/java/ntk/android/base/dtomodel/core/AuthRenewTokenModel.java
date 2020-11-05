package ntk.android.base.dtomodel.core;

import com.google.gson.annotations.SerializedName;

public class AuthRenewTokenModel {
    @SerializedName("SiteId")
    int SiteId;
    @SerializedName("UserId")
    int UserId;
    @SerializedName("UserAccessAdminAllowToAllData")
    boolean UserAccessAdminAllowToAllData;
    @SerializedName("UserAccessAdminAllowToProfessionalData")
    boolean UserAccessAdminAllowToProfessionalData;
    @SerializedName("lang")
    String lang;

}

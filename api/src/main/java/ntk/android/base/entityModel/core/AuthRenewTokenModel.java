package ntk.android.base.entityModel.core;

import com.google.gson.annotations.SerializedName;

class AuthRenewTokenModel {
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

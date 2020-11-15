package ntk.android.base.dtomodel.core;

import com.google.gson.annotations.SerializedName;

public class AuthRenewTokenModel {
    @SerializedName("SiteId")
    public   int SiteId;
    @SerializedName("UserId")
    public   int UserId;
    @SerializedName("UserAccessAdminAllowToAllData")
    public    boolean UserAccessAdminAllowToAllData;
    @SerializedName("UserAccessAdminAllowToProfessionalData")
    public    boolean UserAccessAdminAllowToProfessionalData;
    @SerializedName("Lang")
    String Lang;

}

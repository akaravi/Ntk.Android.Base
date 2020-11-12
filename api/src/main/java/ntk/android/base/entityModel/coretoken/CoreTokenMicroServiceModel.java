package ntk.android.base.entitymodel.coretoken;


import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;
import ntk.android.base.entitymodel.enums.EnumManageUserAccessControllerTypes;
import ntk.android.base.entitymodel.enums.EnumMicroServiceConnectionStatus;
import ntk.android.base.entitymodel.enums.EnumMicroServiceConnectionType;
import ntk.android.base.entitymodel.enums.EnumMicroServiceType;

public class CoreTokenMicroServiceModel extends BaseEntity<String> {


    @SerializedName("linkUserId")
    public Long linkUserId;
    @SerializedName("LinkSiteId")
    public Long LinkSiteId;
    @SerializedName("deviceId")
    public String deviceId;
    @SerializedName("deviceType")
    public EnumMicroServiceType deviceType;
    @SerializedName("userType")
    public EnumManageUserAccessControllerTypes userType;
    @SerializedName("deviceConnectionType")
    public EnumMicroServiceConnectionType deviceConnectionType;
    @SerializedName("deviceConnectionState")
    public EnumMicroServiceConnectionStatus deviceConnectionState;
    @SerializedName("requestDate")
    public String requestDate;
    @SerializedName("usedUsername")
    public String usedUsername;
    @SerializedName("iP")
    public String iP;
    @SerializedName("description")
    public String description;
}

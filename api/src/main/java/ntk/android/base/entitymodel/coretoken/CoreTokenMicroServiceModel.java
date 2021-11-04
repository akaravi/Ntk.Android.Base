package ntk.android.base.entitymodel.coretoken;


import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;
import ntk.android.base.entitymodel.enums.EnumManageUserAccessControllerTypes;
import ntk.android.base.entitymodel.enums.EnumMicroServiceConnectionStatus;
import ntk.android.base.entitymodel.enums.EnumMicroServiceConnectionType;
import ntk.android.base.entitymodel.enums.EnumMicroServiceType;

public class CoreTokenMicroServiceModel extends BaseEntity<String> {


    @SerializedName("LinkUserId")
    public Long LinkUserId;
    @SerializedName("LinkSiteId")
    public Long LinkSiteId;
    @SerializedName("DeviceId")
    public String DeviceId;
    @SerializedName("DeviceType")
    public EnumMicroServiceType DeviceType;
    @SerializedName("UserType")
    public EnumManageUserAccessControllerTypes UserType;
    @SerializedName("DeviceConnectionType")
    public EnumMicroServiceConnectionType DeviceConnectionType;
    @SerializedName("DeviceConnectionState")
    public EnumMicroServiceConnectionStatus DeviceConnectionState;
    @SerializedName("RequestDate")
    public String RequestDate;
    @SerializedName("UsedUsername")
    public String UsedUsername;
    @SerializedName("IP")
    public String IP;
    @SerializedName("Description")
    public String Description;
}

package ntk.android.base.entitymodel.coretoken;


import ntk.android.base.entitymodel.base.BaseEntity;
import ntk.android.base.entitymodel.enums.EnumManageUserAccessControllerTypes;
import ntk.android.base.entitymodel.enums.EnumMicroServiceConnectionStatus;
import ntk.android.base.entitymodel.enums.EnumMicroServiceConnectionType;
import ntk.android.base.entitymodel.enums.EnumMicroServiceType;

public class CoreTokenMicroServiceModel extends BaseEntity<String> {


    Long linkUserId;
    Long linkSiteId;
    String deviceId;
    EnumMicroServiceType deviceType;
    EnumManageUserAccessControllerTypes userType;
    EnumMicroServiceConnectionType deviceConnectionType;
    EnumMicroServiceConnectionStatus deviceConnectionState;
    String requestDate;
    String usedUsername;
    String iP;
    String description;
}

package ntk.android.base.entitymodel.coretoken;

import ntk.android.base.entitymodel.base.BaseEntity;
import ntk.android.base.entitymodel.enums.EnumManageUserAccessAreaTypes;
import ntk.android.base.entitymodel.enums.EnumManageUserAccessControllerTypes;

public class UserTokenModel extends BaseEntity<String> {

    long linkUserId;
    long linkMemberUserId;
    long linkSiteId;
    String deviceClientMAC;
    long linkDeviceId;
    String token;
    String expireDate;
    EnumManageUserAccessAreaTypes userAccessAreaType;
    EnumManageUserAccessControllerTypes userType;
    boolean userAccessAdminAllowToAllData;
    boolean userAccessAdminAllowToProfessionalData;
    boolean rememberOnDevice;
    String browserLanguage;
    int userLanguage;


}

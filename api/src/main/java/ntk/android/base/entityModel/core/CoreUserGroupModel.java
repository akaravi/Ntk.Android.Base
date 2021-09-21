package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseEntity;
import ntk.android.base.entitymodel.coremain.CoreCpMainMenuCmsUserGroupModel;
import ntk.android.base.entitymodel.enums.EnumManageUserAccessControllerTypes;

public class CoreUserGroupModel extends BaseEntity<Long> {

    @SerializedName("TitleML")
    public   String TitleML;
    @SerializedName("Title")
    public   String Title;
    @SerializedName("TitleResourceLanguage")
    public   String TitleResourceLanguage;
    @SerializedName("Description")
    public   String Description;
    @SerializedName("UserType")
    public   EnumManageUserAccessControllerTypes UserType;
    @SerializedName("UserTypeTitle")
    public  String UserTypeTitle;
    @SerializedName("UserTypeDescription")
    public String UserTypeDescription;
    @SerializedName("CmsSiteUsers")
    public  List<CoreSiteUserModel> CmsSiteUsers;
    @SerializedName("CmsCpMainMenuCmsUserGroup")
    public  List<CoreCpMainMenuCmsUserGroupModel> CmsCpMainMenuCmsUserGroup;
}



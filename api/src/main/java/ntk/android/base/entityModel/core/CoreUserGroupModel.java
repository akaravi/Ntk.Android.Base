package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseEntity;
import ntk.android.base.entitymodel.coremodulemain.CoreCpMainMenuCmsUserGroupModel;
import ntk.android.base.entitymodel.enums.EnumManageUserAccessControllerTypes;

public class CoreUserGroupModel extends BaseEntity<Long> {

    public @SerializedName("TitleML")
    String TitleML;
    public @SerializedName("Title")
    String Title;
    public @SerializedName("TitleResourceLanguage")
    String TitleResourceLanguage;
    public @SerializedName("Description")
    String Description;
    public @SerializedName("UserType")
    EnumManageUserAccessControllerTypes UserType;
    public @SerializedName("UserTypeTitle")
    String UserTypeTitle;
    public @SerializedName("UserTypeDescription")
    String UserTypeDescription;
    public @SerializedName("CmsSiteUsers")
    List<CoreSiteUserModel> CmsSiteUsers;
    public @SerializedName("CmsCpMainMenuCmsUserGroup")
    List<CoreCpMainMenuCmsUserGroupModel> CmsCpMainMenuCmsUserGroup;
}



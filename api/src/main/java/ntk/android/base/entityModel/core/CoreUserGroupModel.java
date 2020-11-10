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
    public @SerializedName("titleResourceLanguage")
    String titleResourceLanguage;
    public @SerializedName("description")
    String description;
    public @SerializedName("userType")
    EnumManageUserAccessControllerTypes userType;
    public @SerializedName("userTypeTitle")
    String userTypeTitle;
    public @SerializedName("userTypeDescription")
    String userTypeDescription;
    public @SerializedName("cmsSiteUsers")
    List<CoreSiteUserModel> cmsSiteUsers;
    public @SerializedName("cmsCpMainMenuCmsUserGroup")
    List<CoreCpMainMenuCmsUserGroupModel> cmsCpMainMenuCmsUserGroup;
}



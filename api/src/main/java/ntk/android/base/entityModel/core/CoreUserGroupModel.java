package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseEntity;
import ntk.android.base.entitymodel.coremodulemain.CoreCpMainMenuCmsUserGroupModel;
import ntk.android.base.entitymodel.enums.EnumManageUserAccessControllerTypes;

public class CoreUserGroupModel extends BaseEntity<Long> {

    public @SerializedName("")
    String TitleML;
    public @SerializedName("")
    String Title;
    public @SerializedName("")
    String titleResourceLanguage;
    public @SerializedName("")
    String description;
    public @SerializedName("")
    EnumManageUserAccessControllerTypes userType;
    public @SerializedName("")
    String userTypeTitle;
    public @SerializedName("")
    String userTypeDescription;
    public @SerializedName("")
    List<CoreSiteUserModel> cmsSiteUsers;
    public @SerializedName("")
    List<CoreCpMainMenuCmsUserGroupModel> cmsCpMainMenuCmsUserGroup;
}



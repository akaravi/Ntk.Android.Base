package ntk.android.base.entitymodel.coremain;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.core.CoreCpMainMenuModel;
import ntk.android.base.entitymodel.core.CoreUserGroupModel;

public class CoreCpMainMenuCmsUserGroupModel {
    @SerializedName("CmsCpMainMenu_Id")
    public long CmsCpMainMenu_Id;
    @SerializedName("CmsUserGroup_Id")
    public long CmsUserGroup_Id;
    @SerializedName("CmsCpMainMenu")
    public CoreCpMainMenuModel CmsCpMainMenu;
    @SerializedName("CmsUserGroup")
    public CoreUserGroupModel CmsUserGroup;

}

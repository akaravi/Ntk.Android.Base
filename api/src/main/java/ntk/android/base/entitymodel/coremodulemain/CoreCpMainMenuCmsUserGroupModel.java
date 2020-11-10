package ntk.android.base.entitymodel.coremodulemain;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.core.CoreCpMainMenuModel;
import ntk.android.base.entitymodel.core.CoreUserGroupModel;

public class CoreCpMainMenuCmsUserGroupModel {
    @SerializedName("cmsCpMainMenu_Id")
    public long cmsCpMainMenu_Id;
    @SerializedName("cmsUserGroup_Id")
    public long cmsUserGroup_Id;
    @SerializedName("cmsCpMainMenu")
    public CoreCpMainMenuModel cmsCpMainMenu;
    @SerializedName("cmsUserGroup")
    public CoreUserGroupModel cmsUserGroup;

}

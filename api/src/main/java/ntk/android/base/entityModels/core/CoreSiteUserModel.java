package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreSiteUserModel extends BaseEntity<Long> {
    @SerializedName("ExpireDate")
    public String ExpireDate;
    @SerializedName("LinkSiteId")
    public long LinkSiteId;
    @SerializedName("LinkUserId")
    public long LinkUserId;
    @SerializedName("LinkUserGroupId")
    public long LinkUserGroupId;
    // tslint:disable-next-line: variable-name
    @SerializedName(" virtual_CmsSite")
    public CoreSiteModel virtual_CmsSite;
    @SerializedName("CmsSite")
    public CoreSiteModel CmsSite;

    @SerializedName(" virtual_CmsUser")
    public CoreUserModel virtual_CmsUser;
    @SerializedName("CmsUser")
    public CoreUserModel CmsUser;
    // tslint:disable-next-line: variable-name
    @SerializedName(" virtual_CmsUserGroup")
    public CoreUserGroupModel virtual_CmsUserGroup;
    @SerializedName("CmsUserGroup")
    public CoreUserGroupModel CmsUserGroup;
}

package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreSiteUserModel extends BaseEntity<Long> {
    public @SerializedName("expireDate")
    String expireDate;
    public @SerializedName("LinkSiteId")
    long LinkSiteId;
    public @SerializedName("linkUserId")
    long linkUserId;
    public @SerializedName("linkUserGroupId")
    long linkUserGroupId;
    // tslint:disable-next-line: variable-name
    public @SerializedName("virtual_CmsSite")
    CoreSiteModel virtual_CmsSite;
    public @SerializedName("cmsSite")
    CoreSiteModel cmsSite;

    public @SerializedName("virtual_CmsUser")
    CoreUserModel virtual_CmsUser;
    public @SerializedName("cmsUser")
    CoreUserModel cmsUser;
    // tslint:disable-next-line: variable-name
    public @SerializedName("virtual_CmsUserGroup")
    CoreUserGroupModel virtual_CmsUserGroup;
    public @SerializedName("cmsUserGroup")
    CoreUserGroupModel cmsUserGroup;
}

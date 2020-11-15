package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreSiteUserModel extends BaseEntity<Long> {
    public @SerializedName("ExpireDate")
    String ExpireDate;
    public @SerializedName("LinkSiteId")
    long LinkSiteId;
    public @SerializedName("LinkUserId")
    long LinkUserId;
    public @SerializedName("LinkUserGroupId")
    long LinkUserGroupId;
    // tslint:disable-next-line: variable-name
    public @SerializedName("Virtual_CmsSite")
    CoreSiteModel Virtual_CmsSite;
    public @SerializedName("CmsSite")
    CoreSiteModel CmsSite;

    public @SerializedName("Virtual_CmsUser")
    CoreUserModel Virtual_CmsUser;
    public @SerializedName("CmsUser")
    CoreUserModel CmsUser;
    // tslint:disable-next-line: variable-name
    public @SerializedName("Virtual_CmsUserGroup")
    CoreUserGroupModel Virtual_CmsUserGroup;
    public @SerializedName("CmsUserGroup")
    CoreUserGroupModel CmsUserGroup;
}

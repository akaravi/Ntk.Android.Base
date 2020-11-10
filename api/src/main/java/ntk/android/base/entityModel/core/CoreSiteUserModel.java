package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreSiteUserModel extends BaseEntity<Long> {
 public @SerializedName("")    String expireDate;
 public @SerializedName("")    long linkSiteId;
 public @SerializedName("")    long linkUserId;
 public @SerializedName("")    long linkUserGroupId;
    // tslint:disable-next-line: variable-name
   public @SerializedName("")  CoreSiteModel virtual_CmsSite;
   public @SerializedName("")  CoreSiteModel cmsSite;
   
  public @SerializedName("")   CoreUserModel virtual_CmsUser;
  public @SerializedName("")   CoreUserModel cmsUser;
    // tslint:disable-next-line: variable-name
 public @SerializedName("")    CoreUserGroupModel virtual_CmsUserGroup;
 public @SerializedName("")    CoreUserGroupModel cmsUserGroup;
}

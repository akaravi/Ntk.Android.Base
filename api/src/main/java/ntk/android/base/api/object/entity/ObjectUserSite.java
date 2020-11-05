package ntk.android.base.api.object.entity;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.BaseEntity;

public class ObjectUserSite extends BaseEntity {
    @SerializedName("LinkCmsSiteId")
    public Long LinkCmsSiteId;
    @SerializedName("LinkMemberUserId")
    public Long LinkObjectUserId;
    @SerializedName("object")
    public Object object;
}
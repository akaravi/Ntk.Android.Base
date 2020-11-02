package ntk.android.base.api.object.entity;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.BaseEntity;

public class ObjectUserGroup extends BaseEntity {
    @SerializedName("ObjectUser_Id")
    public long ObjectUser_Id;

    @SerializedName("ObjectGroup_Id")
    public long ObjectGroup_Id;

    @SerializedName("virtual_ObjectUser")
    public ObjectUser virtual_ObjectUser;

    @SerializedName("objectUser")
    public ObjectUser objectUser;

    @SerializedName("virtual_ObjectGroup")
    public ObjectGroup virtual_ObjectGroup;

    @SerializedName("objectGroup")
    public ObjectGroup objectGroup;
}

package ntk.android.base.api.member.entity;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.BaseEntity;

public class MemberUserGroup extends BaseEntity {
    @SerializedName("MemberUser_Id")
    public long MemberUser_Id;

    @SerializedName("MemberGroup_Id")
    public long MemberGroup_Id;

    @SerializedName("virtual_MemberUser")
    public MemberUser virtual_MemberUser;

    @SerializedName("memberUser")
    public MemberUser memberUser;

    @SerializedName("virtual_MemberGroup")
    public MemberGroup virtual_MemberGroup;

    @SerializedName("memberGroup")
    public MemberGroup memberGroup;
}

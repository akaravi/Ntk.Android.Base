package ntk.android.base.api.member.entity;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.BaseEntityPrev;

public class MemberUserGroupPrev extends BaseEntityPrev {
    @SerializedName("MemberUser_Id")
    public long MemberUser_Id;

    @SerializedName("MemberGroup_Id")
    public long MemberGroup_Id;

    @SerializedName("virtual_MemberUser")
    public MemberUserPrev virtual_MemberUser;

    @SerializedName("memberUser")
    public MemberUserPrev memberUser;

    @SerializedName("virtual_MemberGroup")
    public MemberGroupPrev virtual_MemberGroup;

    @SerializedName("memberGroup")
    public MemberGroupPrev memberGroup;
}

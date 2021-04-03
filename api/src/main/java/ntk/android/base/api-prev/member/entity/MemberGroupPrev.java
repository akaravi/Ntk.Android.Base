package ntk.android.base.api.member.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.BaseEntityPrev;

public class MemberGroupPrev extends BaseEntityPrev {
    @SerializedName("Id")
    public long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkPropertyTypeId")
    public long LinkPropertyTypeId;

    @SerializedName("PropertyType")
    public MemberPropertyTypePrev PropertyType ;


    @SerializedName("MemberUserGroup")
    public List<MemberUserGroupPrev> MemberUserGroups;
}

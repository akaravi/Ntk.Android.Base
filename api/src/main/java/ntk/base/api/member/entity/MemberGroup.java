package ntk.base.api.member.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseEntity;

public class MemberGroup extends BaseEntity {
    @SerializedName("Id")
    public long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkPropertyTypeId")
    public long LinkPropertyTypeId;

    @SerializedName("PropertyType")
    public MemberPropertyType PropertyType ;


    @SerializedName("MemberUserGroup")
    public List<MemberUserGroup> MemberUserGroups;
}

package ntk.android.base.api.member.entity;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.BaseEntity;

public class MemberPropertySite extends BaseEntity {

    @SerializedName("LinkCmsSiteId")
    public Long LinkCmsSiteId;

    @SerializedName("LinkMemberPropertyId")
    public Long LinkMemberPropertyId;

    @SerializedName("memberProperty")
    public MemberProperty memberProperty;

}
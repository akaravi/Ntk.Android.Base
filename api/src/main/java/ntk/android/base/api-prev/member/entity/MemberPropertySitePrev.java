package ntk.android.base.api.member.entity;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.BaseEntityPrev;

public class MemberPropertySitePrev extends BaseEntityPrev {

    @SerializedName("LinkCmsSiteId")
    public Long LinkCmsSiteId;

    @SerializedName("LinkMemberPropertyId")
    public Long LinkMemberPropertyId;

    @SerializedName("memberProperty")
    public MemberPropertyPrev memberProperty;

}
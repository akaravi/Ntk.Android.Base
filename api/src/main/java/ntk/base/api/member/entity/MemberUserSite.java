package ntk.base.api.member.entity;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Member;

import ntk.base.api.baseModel.BaseEntity;

public class MemberUserSite extends BaseEntity {
    @SerializedName("LinkCmsSiteId")
    public Long LinkCmsSiteId;
    @SerializedName("LinkMemberUserId")
    public Long LinkMemberUserId;
    @SerializedName("member")
    public Member member;

}

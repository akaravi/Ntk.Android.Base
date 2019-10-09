package ntk.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.member.entity.MemberUser;
import ntk.base.api.member.entity.MemberUserGroup;

public class MemberUserGroupResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<MemberUserGroup> ListItems;

    @SerializedName("Item")
    public MemberUserGroup Item;
}

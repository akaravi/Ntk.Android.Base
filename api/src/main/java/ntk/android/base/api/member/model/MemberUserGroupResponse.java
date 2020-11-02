package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.member.entity.MemberUserGroup;

public class MemberUserGroupResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<MemberUserGroup> ListItems;

    @SerializedName("Item")
    public MemberUserGroup Item;
}

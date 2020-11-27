package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.member.entity.MemberUserGroupPrev;

public class MemberUserGroupResponse extends ErrorExceptionPrev {
    @SerializedName("ListItems")
    public List<MemberUserGroupPrev> ListItems;

    @SerializedName("Item")
    public MemberUserGroupPrev Item;
}

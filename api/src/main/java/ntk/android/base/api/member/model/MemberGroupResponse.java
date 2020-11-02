package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.member.entity.MemberGroup;

public class MemberGroupResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<MemberGroup> ListItems;

    @SerializedName("Item")
    public MemberGroup Item;
}

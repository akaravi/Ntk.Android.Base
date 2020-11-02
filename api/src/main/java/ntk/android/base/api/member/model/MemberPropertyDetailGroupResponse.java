package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.member.entity.MemberPropertyDetailGroup;

public class MemberPropertyDetailGroupResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<MemberPropertyDetailGroup> ListItems;

    @SerializedName("Item")
    public MemberPropertyDetailGroup Item;
}

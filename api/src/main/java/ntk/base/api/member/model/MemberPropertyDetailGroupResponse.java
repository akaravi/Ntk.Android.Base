package ntk.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.member.entity.MemberPropertyDetailGroup;

public class MemberPropertyDetailGroupResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<MemberPropertyDetailGroup> ListItems;

    @SerializedName("Item")
    public MemberPropertyDetailGroup Item;
}

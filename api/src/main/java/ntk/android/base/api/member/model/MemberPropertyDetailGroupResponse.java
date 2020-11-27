package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.member.entity.MemberPropertyDetailGroupPrev;

public class MemberPropertyDetailGroupResponse extends ErrorExceptionPrev {
    @SerializedName("ListItems")
    public List<MemberPropertyDetailGroupPrev> ListItems;

    @SerializedName("Item")
    public MemberPropertyDetailGroupPrev Item;
}

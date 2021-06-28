package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.member.entity.MemberGroupPrev;

public class MemberGroupResponse extends ErrorExceptionPrev {
    @SerializedName("ListItems")
    public List<MemberGroupPrev> ListItems;

    @SerializedName("Item")
    public MemberGroupPrev Item;
}

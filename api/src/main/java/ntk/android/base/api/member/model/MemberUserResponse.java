package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.member.entity.MemberUserPrev;

public class MemberUserResponse extends ErrorExceptionPrev {
    @SerializedName("ListItems")
    public List<MemberUserPrev> ListItems;

    @SerializedName("Item")
    public MemberUserPrev Item;
}

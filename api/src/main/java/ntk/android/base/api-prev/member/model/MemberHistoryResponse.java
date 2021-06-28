package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.member.entity.MemberHistoryPrev;

public class MemberHistoryResponse extends ErrorExceptionPrev {
    @SerializedName("ListItems")
    public List<MemberHistoryPrev> ListItems;

    @SerializedName("Item")
    public MemberHistoryPrev Item;
}

package ntk.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.member.entity.MemberHistory;

public class MemberHistoryResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<MemberHistory> ListItems;

    @SerializedName("Item")
    public MemberHistory Item;
}

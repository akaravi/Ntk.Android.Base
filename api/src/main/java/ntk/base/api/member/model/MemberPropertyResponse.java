package ntk.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.member.entity.MemberHistory;
import ntk.base.api.member.entity.MemberProperty;

public class MemberPropertyResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<MemberProperty> ListItems;

    @SerializedName("Item")
    public MemberProperty Item;
}

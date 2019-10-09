package ntk.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.member.entity.MemberPropertyDetail;
import ntk.base.api.member.entity.MemberPropertyDetailValue;

public class MemberPropertyDetailValueResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<MemberPropertyDetailValue> ListItems;

    @SerializedName("Item")
    public MemberPropertyDetailValue Item;
}

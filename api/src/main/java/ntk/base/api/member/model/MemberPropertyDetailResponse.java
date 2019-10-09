package ntk.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.member.entity.MemberProperty;
import ntk.base.api.member.entity.MemberPropertyDetail;

public class MemberPropertyDetailResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<MemberPropertyDetail> ListItems;

    @SerializedName("Item")
    public MemberPropertyDetail Item;
}

package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.member.entity.MemberPropertyDetail;

public class MemberPropertyDetailResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<MemberPropertyDetail> ListItems;

    @SerializedName("Item")
    public MemberPropertyDetail Item;
}

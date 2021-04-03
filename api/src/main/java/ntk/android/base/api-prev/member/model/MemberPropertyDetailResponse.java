package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.member.entity.MemberPropertyDetailPrev;

public class MemberPropertyDetailResponse extends ErrorExceptionPrev {
    @SerializedName("ListItems")
    public List<MemberPropertyDetailPrev> ListItems;

    @SerializedName("Item")
    public MemberPropertyDetailPrev Item;
}

package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.member.entity.MemberPropertyDetailValuePrev;

public class MemberPropertyDetailValueResponse extends ErrorExceptionPrev {
    @SerializedName("ListItems")
    public List<MemberPropertyDetailValuePrev> ListItems;

    @SerializedName("Item")
    public MemberPropertyDetailValuePrev Item;
}

package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.member.entity.MemberPropertyPrev;

public class MemberPropertyResponse extends ErrorExceptionPrev {
    @SerializedName("ListItems")
    public List<MemberPropertyPrev> ListItems;

    @SerializedName("Item")
    public MemberPropertyPrev Item;
}

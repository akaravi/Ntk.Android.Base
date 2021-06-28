package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.member.entity.MemberPropertyTypePrev;

public class MemberPropertyTypeResponse extends ErrorExceptionPrev {
    @SerializedName("ListItems")
    public List<MemberPropertyTypePrev> ListItems;

    @SerializedName("Item")
    public MemberPropertyTypePrev Item;
}

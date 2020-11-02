package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.member.entity.MemberProperty;

public class MemberPropertyResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<MemberProperty> ListItems;

    @SerializedName("Item")
    public MemberProperty Item;
}

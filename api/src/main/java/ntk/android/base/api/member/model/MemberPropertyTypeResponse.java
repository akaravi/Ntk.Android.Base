package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.member.entity.MemberPropertyType;

public class MemberPropertyTypeResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<MemberPropertyType> ListItems;

    @SerializedName("Item")
    public MemberPropertyType Item;
}

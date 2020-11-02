package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.member.entity.MemberUser;

public class MemberUserResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<MemberUser> ListItems;

    @SerializedName("Item")
    public MemberUser Item;
}

package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.member.entity.MemberUserSite;

public class MemberUserSiteResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<MemberUserSite> ListItems;

    @SerializedName("Item")
    public MemberUserSite Item;
}

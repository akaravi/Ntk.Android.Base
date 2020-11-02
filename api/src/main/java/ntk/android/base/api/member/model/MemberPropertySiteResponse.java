package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.member.entity.MemberPropertySite;

public class MemberPropertySiteResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<MemberPropertySite> ListItems;

    @SerializedName("Item")
    public MemberPropertySite Item;
}

package ntk.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.member.entity.MemberProperty;
import ntk.base.api.member.entity.MemberPropertySite;

public class MemberPropertySiteResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<MemberPropertySite> ListItems;

    @SerializedName("Item")
    public MemberPropertySite Item;
}

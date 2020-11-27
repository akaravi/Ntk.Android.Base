package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.member.entity.MemberPropertySitePrev;

public class MemberPropertySiteResponse extends ErrorExceptionPrev {
    @SerializedName("ListItems")
    public List<MemberPropertySitePrev> ListItems;

    @SerializedName("Item")
    public MemberPropertySitePrev Item;
}

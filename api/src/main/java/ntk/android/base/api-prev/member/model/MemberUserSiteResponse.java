package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.member.entity.MemberUserSitePrev;

public class MemberUserSiteResponse extends ErrorExceptionPrev {
    @SerializedName("ListItems")
    public List<MemberUserSitePrev> ListItems;

    @SerializedName("Item")
    public MemberUserSitePrev Item;
}

package ntk.android.base.api.estate.entity;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.BaseEntityPrev;

public class EstatePropertyDetailGroup extends BaseEntityPrev {

    @SerializedName("Id")
    public String Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("IconFont")
    public String IconFont;

    @SerializedName("ShowInFormOrder")
    public String ShowInFormOrder;

    @SerializedName("LinkPropertyTypeId")
    public String LinkPropertyTypeId;
}

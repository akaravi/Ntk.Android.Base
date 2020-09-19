package ntk.base.api.estate.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseEntity;

public class EstatePropertyDetailGroup extends BaseEntity {

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

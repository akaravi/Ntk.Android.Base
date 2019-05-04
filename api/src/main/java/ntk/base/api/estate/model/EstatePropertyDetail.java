package ntk.base.api.estate.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseEntity;

public class EstatePropertyDetail extends BaseEntity{

    @SerializedName("Title")
    public String Title;

    @SerializedName("IconFont")
    public String IconFont;

    @SerializedName("ShowInFormOrder")
    public int ShowInFormOrder;

    @SerializedName("LinkPropertyTypeId")
    public int LinkPropertyTypeId;

    @SerializedName("virtual_PropertyType")
    public EstatePropertyType virtual_PropertyType;

    @SerializedName("PropertyType")
    public EstatePropertyType PropertyType;

    @SerializedName("LinkSiteId")
    public int LinkSiteId;
}

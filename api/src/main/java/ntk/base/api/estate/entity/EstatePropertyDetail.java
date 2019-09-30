package ntk.base.api.estate.entity;

import com.google.gson.annotations.SerializedName;

public class EstatePropertyDetail {

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

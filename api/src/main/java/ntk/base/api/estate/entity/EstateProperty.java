package ntk.base.api.estate.entity;

import com.google.gson.annotations.SerializedName;

public class EstateProperty {
//لیست املاک
    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkLocationId")
    public int LinkLocationId;

    @SerializedName("Description")
    public String Description;

    @SerializedName("LinkCmsUserId")
    public Long LinkCmsUserId;

    @SerializedName("LinkPropertyTypeId")
    public Long LinkPropertyTypeId;

    @SerializedName("virtual_PropertyType")
    public EstatePropertyType virtual_PropertyType;

    @SerializedName("PropertyType")
    public EstatePropertyType PropertyType;

    @SerializedName("LinkSiteId")
    public int LinkSiteId;

     @SerializedName("Geolocationlatitude")
    public Long Geolocationlatitude;
}

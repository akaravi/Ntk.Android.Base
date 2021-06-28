package ntk.android.base.api.estate.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.BaseEntityPrev;

public class EstateProperty extends BaseEntityPrev {
//لیست املاک

    @SerializedName("Id")
    public String Id;


    @SerializedName("Title")
    public String Title;


    @SerializedName("CreatedYaer")
    public int CreatedYaer;
    @SerializedName("Partition")
    public int Partition;

    @SerializedName("Area")
    public double Area;

    @SerializedName("LinkEstateUserId")
    public int LinkEstateUserId;

    @SerializedName("LinkLocationId")
    public int LinkLocationId;

    @SerializedName("Description")
    public String Description;

    @SerializedName("LinkCmsUserId")
    public Long LinkCmsUserId;

    @SerializedName("LinkPropertyTypeId")
    public String LinkPropertyTypeId;


    @SerializedName("PropertyType")
    public EstatePropertyType PropertyType;

    @SerializedName("LinkSiteId")
    public int LinkSiteId;

    @SerializedName("Geolocationlatitude")
    public Double Geolocationlatitude;

    @SerializedName("Geolocationlongitude")
    public Double Geolocationlongitude;

    @SerializedName("Address")
    public String Address;

    @SerializedName("LinkMainImageId")
    public int LinkMainImageId;
    @SerializedName("LinkExtraImageIds")
    public String LinkExtraImageIds;
    @SerializedName("LinkFileIds")
    public String LinkFileIds;
    @SerializedName("ScoreClick")
    public int ScoreClick;

    @SerializedName("ScoreSumPercent")
    public int ScoreSumPercent;

    @SerializedName("ViewCount")
    public int ViewCount;

    @SerializedName("LinkMainImageIdSrc")
    public String LinkMainImageIdSrc;
    @SerializedName("LinkExtraImageIdsSrc")
    public List<String> LinkExtraImageIdsSrc;
    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;

    @SerializedName("Contracts")
    public List<EstateContractPrev> Contracts;

    @SerializedName("PropertyDetailValues")
    public  List<EstatePropertyDetailValue>  PropertyDetailValues;

    @SerializedName("PropertyDetailGroups")
    public  List<EstatePropertyDetailGroup>  PropertyDetailGroups;
}

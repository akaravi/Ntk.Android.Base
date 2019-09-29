package ntk.base.api.object.viewModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseEntity;

public class ObjectProperty extends BaseEntity {
    @SerializedName("Id")
    public long Id;

    @SerializedName("LinkObjectUserId")
    public Long LinkObjectUserId;
    @SerializedName("Title")
    public String Title;

    @SerializedName("Description")
    public String Description;
    @SerializedName("LinkCmsUserId")
    public Long LinkCmsUserId;

    @SerializedName("LinkPropertyTypeId")
    public Long LinkPropertyTypeId;

    @SerializedName("virtual_ObjectUser")
    public ObjectUser virtual_ObjectUser;

    @SerializedName("ObjectUser")
    public ObjectUser ObjectUser;

    @SerializedName("virtual_PropertyType")
    public ObjectPropertyType virtual_PropertyType;
    @SerializedName("PropertyType")
    public ObjectPropertyType PropertyType;


    @SerializedName("Address")
    public String Address;
    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;

    @SerializedName("LinkExtraImageIds")
    public String LinkExtraImageIds;

    @SerializedName("LinkFileIds")
    public String LinkFileIds;

    @SerializedName("SumLikeClick")
    public int SumLikeClick;

    @SerializedName("SumLikeScore")
    public int SumLikeScore;

    @SerializedName("ViewCount")
    public int ViewCount;


    @SerializedName("Histores")
    public List<ObjectHistory> Histores;
    @SerializedName("virtual_PropertyDetailValue")
    public List<ObjectPropertyDetailValue> virtual_PropertyDetailValue;

    @SerializedName("PropertyDetailValue")
    public List<ObjectPropertyDetailValue> PropertyDetailValue;

    @SerializedName("MainImageSrc")
    public String MainImageSrc;

    @SerializedName("LinkExtraImageIdsSrc")
    public List<String> LinkExtraImageIdsSrc;

    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;

}

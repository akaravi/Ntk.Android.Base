package ntk.base.api.object.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseEntity;

public class ObjectPropertyType extends BaseEntity {
    @SerializedName("Id")
    public long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("Description")
    public String Description ;

    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;

    @SerializedName("PropertyDetails")
    public List<ObjectPropertyDetail> PropertyDetails ;

    @SerializedName("virtual_PropertyDetails")
    public List<ObjectPropertyDetail> virtual_PropertyDetails ;

    @SerializedName("ObjectGroup")
    public List<ObjectGroup> objectGroup ;

}

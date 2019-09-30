package ntk.base.api.object.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseEntity;

public class ObjectPropertyDetailGroup extends BaseEntity {

    @SerializedName("Title")
    public String Title ;

    @SerializedName("IconFont")
    public String IconFont ;

    @SerializedName("ShowInFormOrder")
    public Long ShowInFormOrder ;

    @SerializedName("LinkPropertyTypeId")
    public Long LinkPropertyTypeId ;

    @SerializedName("virtual_PropertyType")
    public ObjectPropertyType virtual_PropertyType ;

    @SerializedName("PropertyType")
    public ObjectPropertyType PropertyType ;

    @SerializedName("virtual_PropertyDetails")
    private List<ObjectPropertyDetail> virtual_PropertyDetails ;

    @SerializedName("PropertyDetails")
    private List<ObjectPropertyDetail> PropertyDetails;
}

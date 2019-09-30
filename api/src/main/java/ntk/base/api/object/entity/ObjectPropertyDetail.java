package ntk.base.api.object.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseEntity;

public class ObjectPropertyDetail  extends BaseEntity {
    @SerializedName("Id")
    public long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("IconFont")
    public String IconFont;

    @SerializedName("InputDataType")
    public int InputDataType;

    @SerializedName("Unit")
    public String Unit;

    @SerializedName("UiDesignType")
    public int UiDesignType;

    @SerializedName("UiDesignColor")
    public String UiDesignColor;

    @SerializedName("InvisibleForEndUser")
    public boolean InvisibleForEndUser;

    @SerializedName("InvisibleForSubmiter")
    public boolean InvisibleForSubmiter;

    @SerializedName("Required")
    public boolean Required;

    @SerializedName("IsHistoryable")
    public boolean IsHistoryable;

    @SerializedName("IsSearchable")
    public boolean IsSearchable;


    @SerializedName("LinkPropertyDetailGroupId")
    public Long LinkPropertyDetailGroupId;

    @SerializedName("virtual_PropertyDetailGroup")
    public ObjectPropertyDetailGroup virtual_PropertyDetailGroup;

    @SerializedName("PropertyDetailGroup")
    public ObjectPropertyDetailGroup PropertyDetailGroup;

    @SerializedName("LinkPropertyTypeId")
    public Long LinkPropertyTypeId;

    @SerializedName("virtual_PropertyType")
    public ObjectPropertyType virtual_PropertyType;

    @SerializedName("PropertyType")
    public ObjectPropertyType PropertyType;

    @SerializedName("ShowInFormOrder")
    public Long ShowInFormOrder;

    @SerializedName("JsonDefaultValue")
    public String JsonDefaultValue;

    @SerializedName("DefaultValue")
    public ObjectPropertyDetailDefaultValue DefaultValue;

}
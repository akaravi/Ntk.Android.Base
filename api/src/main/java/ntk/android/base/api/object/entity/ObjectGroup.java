package ntk.android.base.api.object.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.BaseEntity;

public class ObjectGroup extends BaseEntity {
    @SerializedName("Id")
    public long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkPropertyTypeId")
    public long LinkPropertyTypeId;

    @SerializedName("PropertyType")
    public ObjectPropertyType PropertyType ;


    @SerializedName("ObjectUserGroup")
    public List<ObjectUserGroup> ObjectUserGroups;
}
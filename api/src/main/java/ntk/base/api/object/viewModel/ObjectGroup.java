package ntk.base.api.object.viewModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseEntity;

public class ObjectGroup extends BaseEntity {
    @SerializedName("Id")
    public long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkPropertyTypeId")
    public long LinkPropertyTypeId;

    @SerializedName("LinkPropertyTypeId")
    public ObjectPropertyType PropertyType ;


    @SerializedName("ObjectUserGroup")
    public List<ObjectUserGroup> ObjectUserGroups;
}

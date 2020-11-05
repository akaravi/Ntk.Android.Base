package ntk.android.base.api.object.entity;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.BaseEntity;

public class ObjectPropertySite extends BaseEntity {

    @SerializedName("LinkCmsSiteId")
    public Long LinkCmsSiteId;

    @SerializedName("LinkObjectPropertyId")
    public Long LinkObjectPropertyId;

    @SerializedName("objectProperty")
    public ObjectProperty objectProperty;

}
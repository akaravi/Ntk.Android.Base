package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseEntity;

public class CoreLocation extends BaseEntity {
    @SerializedName("Id")
    public long Id;

    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("Title")
    public String Title;

    @SerializedName("LocationType")
    public int LocationType;
}

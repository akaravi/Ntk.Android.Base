package ntk.android.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.BaseEntityPrev;

public class CoreLocationPrev extends BaseEntityPrev {
    @SerializedName("Id")
    public long Id;

    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("Title")
    public String Title;

    @SerializedName("LocationType")
    public int LocationType;
}

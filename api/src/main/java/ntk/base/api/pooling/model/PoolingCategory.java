package ntk.base.api.pooling.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PoolingCategory {

    @SerializedName("Id")
    public long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("FontIcon")
    public String fontIcon;

    @SerializedName("LinkParentId")
    public Long linkParentId;

    @SerializedName("CreatorId")
    public int creatorId;

    @SerializedName("LinkMainImageId")
    public String imageSrc;

    @SerializedName("virtual_Category")
    public PoolingCategory virtualCategory;

    @SerializedName("Children")
    public List<PoolingCategory> children;
}

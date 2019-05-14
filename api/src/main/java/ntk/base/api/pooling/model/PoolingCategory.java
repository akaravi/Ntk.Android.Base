package ntk.base.api.pooling.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.news.model.NewsCategory;

public class PoolingCategory  {

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

    @SerializedName("virtual_Category")
    public NewsCategory virtualCategory;

    @SerializedName("Children")
    public List<NewsCategory> children;
}

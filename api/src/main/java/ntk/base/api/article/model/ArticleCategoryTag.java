package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseEntity;

public class ArticleCategoryTag  extends BaseEntity {

    @SerializedName("Id")
    public long Id;

    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("Title")
    public String Title;

    @SerializedName("MainImageSrc")
    public String imageSrc;

    @SerializedName("LinkMainImageId")
    public String LinkMainImageId;

    @SerializedName("LinkMainImageSrc")
    public String LinkMainImageSrc;

    @SerializedName("Children")
    public List<ArticleCategoryTag> Children;
}

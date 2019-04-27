package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseEntity;

public class ArticleTag  extends BaseEntity {

    @SerializedName("Id")
    public long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkCategoryTagId")
    public String LinkCategoryTagId;
}

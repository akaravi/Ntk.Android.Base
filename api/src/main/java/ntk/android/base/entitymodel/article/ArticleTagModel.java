package ntk.android.base.entitymodel.article;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class ArticleTagModel extends BaseModuleEntity<Long> {
    @SerializedName("linkCategoryTagId")
    public Long linkCategoryTagId;
    @SerializedName("title")
    public String title;
    @SerializedName("contentTags")
    public ArticleContentTagModel contentTags;
    @SerializedName("virtual_CategoryTag")
    public ArticleCategoryTagModel virtual_CategoryTag;
    @SerializedName("categoryTag")
    public ArticleCategoryTagModel categoryTag;
}

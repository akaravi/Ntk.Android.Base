package ntk.android.base.entitymodel.article;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseEntityCategory;

public class ArticleCategoryTagModel extends BaseEntityCategory<Long> {
    @SerializedName("Children")
    public List<ArticleCategoryModel> Children;
    @SerializedName("categoryTag")
    public ArticleCategoryModel categoryTag;
    @SerializedName("virtual_categoryTag")
    public ArticleCategoryModel virtual_categoryTag;
    @SerializedName("tags")
    public List<ArticleTagModel> tags;
}

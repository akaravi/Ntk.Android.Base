package ntk.android.base.entitymodel.article;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseEntityCategory;

public class ArticleCategoryModel extends BaseEntityCategory<Long> {

    @SerializedName("Children")
    public List<ArticleCategoryModel> Children;
    @SerializedName("Category")
    public ArticleCategoryModel Category;
    @SerializedName("Virtual_Category")
    public ArticleCategoryModel Virtual_Category;
    @SerializedName("Contents")
    public List<ArticleContentModel> Contents;
}

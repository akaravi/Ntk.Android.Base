package ntk.android.base.entitymodel.blog;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseEntityCategory;

public class BlogCategoryModel extends BaseEntityCategory<Long> {

    @SerializedName("Children")
    public List<BlogCategoryModel> Children;
    @SerializedName("Category")
    public BlogCategoryModel Category;
    @SerializedName("Virtual_Category")
    public BlogCategoryModel Virtual_Category;
    @SerializedName("Contents")
    public List<BlogContentModel> Contents;
}

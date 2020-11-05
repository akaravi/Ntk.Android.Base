package ntk.android.base.entitymodel.blog;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseEntityCategory;

public class BlogCategoryTagModel extends BaseEntityCategory<Long> {
    @SerializedName("Children")
    public List<BlogCategoryModel> Children;
    @SerializedName("categoryTag")
    public BlogCategoryModel categoryTag;
    @SerializedName("virtual_categoryTag")
    public BlogCategoryModel virtual_categoryTag;
    @SerializedName("tags")
    public List<BlogTagModel> tags;
}

package ntk.android.base.entitymodel.news;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseEntityCategory;

public class NewsCategoryTagModel extends BaseEntityCategory<Long> {
    @SerializedName("Children")
    public List<NewsCategoryModel> Children;
    @SerializedName("categoryTag")
    public NewsCategoryModel categoryTag;
    @SerializedName("virtual_categoryTag")
    public NewsCategoryModel virtual_categoryTag;
    @SerializedName("tags")
    public List<NewsTagModel> tags;
}

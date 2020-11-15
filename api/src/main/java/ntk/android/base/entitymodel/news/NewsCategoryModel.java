package ntk.android.base.entitymodel.news;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseEntityCategory;

public class NewsCategoryModel extends BaseEntityCategory<Long> {

    @SerializedName("Children")
    public List<NewsCategoryModel> Children;
    @SerializedName("Category")
    public NewsCategoryModel Category;
    @SerializedName("Virtual_Category")
    public NewsCategoryModel Virtual_Category;
    @SerializedName("Contents")
    public List<NewsContentModel> Contents;
}

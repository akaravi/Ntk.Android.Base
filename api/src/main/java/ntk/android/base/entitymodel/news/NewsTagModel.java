package ntk.android.base.entitymodel.news;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class NewsTagModel extends BaseModuleEntity<Long> {
    @SerializedName("linkCategoryTagId")
    public Long linkCategoryTagId;
    @SerializedName("title")
    public String title;
    @SerializedName("contentTags")
    public NewsContentTagModel contentTags;
    @SerializedName("virtual_CategoryTag")
    public NewsCategoryTagModel virtual_CategoryTag;
    @SerializedName("categoryTag")
    public NewsCategoryTagModel categoryTag;
}

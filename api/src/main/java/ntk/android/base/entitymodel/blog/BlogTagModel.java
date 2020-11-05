package ntk.android.base.entitymodel.blog;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class BlogTagModel extends BaseModuleEntity<Long> {
    @SerializedName("linkCategoryTagId")
    public Long linkCategoryTagId;
    @SerializedName("title")
    public String title;
    @SerializedName("contentTags")
    public BlogContentTagModel contentTags;
    @SerializedName("virtual_CategoryTag")
    public BlogCategoryTagModel virtual_CategoryTag;
    @SerializedName("categoryTag")
    public BlogCategoryTagModel categoryTag;
}

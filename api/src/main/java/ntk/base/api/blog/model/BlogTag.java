package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

public class BlogTag {

    @SerializedName("Id")
    public long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkCategoryTagId")
    public String LinkCategoryTagId;
}

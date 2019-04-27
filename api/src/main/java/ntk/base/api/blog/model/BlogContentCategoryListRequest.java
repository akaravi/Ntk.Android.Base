package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.FilterModel;

public class BlogContentCategoryListRequest extends FilterModel {

    @SerializedName("LinkContentId")
    public Long LinkContentId;
}

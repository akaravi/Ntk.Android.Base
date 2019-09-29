package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.FilterModel;

public class BlogContentListRequest extends FilterModel {

    @SerializedName("TagIds")
    public List<Long> TagIds;
}

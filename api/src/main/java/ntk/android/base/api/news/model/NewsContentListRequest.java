package ntk.android.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.FilterModel;

public class NewsContentListRequest extends FilterModel {

    @SerializedName("TagIds")
    public List<Long> TagIds;


}

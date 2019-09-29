package ntk.base.api.movieGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.FilterModel;

public class MovieGalleryContentListRequest extends FilterModel {

    @SerializedName("TagIds")
    public List<Long> TagIds;
}

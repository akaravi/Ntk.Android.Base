package ntk.base.api.movieGallery.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.FilterModel;

public class MovieGalleryContentSimilarListRequest extends FilterModel {

    @SerializedName("LinkContentId")
    public Long LinkContentId;
}

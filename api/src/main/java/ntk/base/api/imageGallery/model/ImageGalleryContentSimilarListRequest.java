package ntk.base.api.imageGallery.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.FilterModel;

public class ImageGalleryContentSimilarListRequest extends FilterModel {

    @SerializedName("LinkContentId")
    public Long LinkContentId;
}

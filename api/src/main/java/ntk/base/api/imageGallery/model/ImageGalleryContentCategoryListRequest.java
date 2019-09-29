package ntk.base.api.imageGallery.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.FilterModel;

public class ImageGalleryContentCategoryListRequest extends FilterModel {

    @SerializedName("LinkContentId")
    public Long LinkContentId;
}

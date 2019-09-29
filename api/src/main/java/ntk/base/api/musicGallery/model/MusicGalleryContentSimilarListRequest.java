package ntk.base.api.musicGallery.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.FilterModel;

public class MusicGalleryContentSimilarListRequest extends FilterModel {

    @SerializedName("LinkContentId")
    public Long LinkContentId;
}

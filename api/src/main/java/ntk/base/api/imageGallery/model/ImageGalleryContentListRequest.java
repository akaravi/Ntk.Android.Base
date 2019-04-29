package ntk.base.api.imageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.FilterModel;

public class ImageGalleryContentListRequest extends FilterModel {

    @SerializedName("TagIds")
    public List<Long> TagIds;
}

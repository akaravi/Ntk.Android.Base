package ntk.base.api.musicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.FilterModel;

public class MusicGalleryContentListRequest extends FilterModel {

    @SerializedName("TagIds")
    public List<Long> TagIds;
}

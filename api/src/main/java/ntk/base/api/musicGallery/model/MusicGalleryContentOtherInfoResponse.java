package ntk.base.api.musicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class MusicGalleryContentOtherInfoResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ntk.base.api.imageGallery.model.MovieGalleryContentOtherInfo> ListItems;

    @SerializedName("Item")
    public ntk.base.api.imageGallery.model.MovieGalleryContentOtherInfo Item;
}

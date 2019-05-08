package ntk.base.api.musicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.movieGallery.model.MovieGalleryContentOtherInfo;

public class MusicGalleryContentOtherInfoResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryContentOtherInfo> ListItems;

    @SerializedName("Item")
    public MovieGalleryContentOtherInfo Item;
}

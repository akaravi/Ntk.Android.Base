package ntk.base.api.musicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.movieGallery.model.MovieGalleryContent;

public class MusicGalleryContentFavoriteListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryContent> ListItems;

    @SerializedName("Main")
    public MovieGalleryContent Item;
}

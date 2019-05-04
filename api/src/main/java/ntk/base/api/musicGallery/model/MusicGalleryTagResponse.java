package ntk.base.api.musicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.movieGallery.model.MovieGalleryTag;

public class MusicGalleryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryTag> ListItems;

    @SerializedName("Main")
    public MovieGalleryTag Item;
}

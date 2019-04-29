package ntk.base.api.musicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.movieGallery.model.MovieGalleryCategoryTag;

public class MusicGalleryCategoryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryCategoryTag> ListItems;

    @SerializedName("Item")
    public MovieGalleryCategoryTag Item;
}

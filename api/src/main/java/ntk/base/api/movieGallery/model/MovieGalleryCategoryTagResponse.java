package ntk.base.api.movieGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.movieGallery.entity.MovieGalleryCategoryTag;

public class MovieGalleryCategoryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryCategoryTag> ListItems;

    @SerializedName("Item")
    public MovieGalleryCategoryTag Item;
}

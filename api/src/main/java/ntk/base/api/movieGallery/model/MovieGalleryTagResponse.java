package ntk.base.api.movieGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.movieGallery.entity.MovieGalleryTag;

public class MovieGalleryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryTag> ListItems;

    @SerializedName("Item")
    public MovieGalleryTag Item;
}

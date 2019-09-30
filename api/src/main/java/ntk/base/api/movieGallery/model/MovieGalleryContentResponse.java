package ntk.base.api.movieGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.movieGallery.entity.MovieGalleryContent;

public class MovieGalleryContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryContent> ListItems;

    @SerializedName("Item")
    public MovieGalleryContent Item;
}

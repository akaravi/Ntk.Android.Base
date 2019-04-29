package ntk.base.api.imageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.movieGallery.model.MovieGalleryContent;

public class ImageGalleryContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryContent> ListItems;

    @SerializedName("Item")
    public MovieGalleryContent Item;
}

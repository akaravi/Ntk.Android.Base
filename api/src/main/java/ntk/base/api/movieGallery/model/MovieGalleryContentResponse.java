package ntk.base.api.movieGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class MovieGalleryContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryContent> ListItems;

    @SerializedName("Main")
    public MovieGalleryContent Item;
}

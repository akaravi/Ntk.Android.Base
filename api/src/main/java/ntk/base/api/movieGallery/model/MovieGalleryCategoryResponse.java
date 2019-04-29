package ntk.base.api.movieGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class MovieGalleryCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryCategory> ListItems;

    @SerializedName("Item")
    public MovieGalleryCategory Item;
}

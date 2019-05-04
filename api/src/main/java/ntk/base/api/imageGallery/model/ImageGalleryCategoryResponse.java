package ntk.base.api.imageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.movieGallery.model.MovieGalleryCategory;

public class ImageGalleryCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryCategory> ListItems;

    @SerializedName("Main")
    public MovieGalleryCategory Item;
}

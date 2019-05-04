package ntk.base.api.movieGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class MovieGalleryCategoryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryCategoryTag> ListItems;

    @SerializedName("Main")
    public MovieGalleryCategoryTag Item;
}

package ntk.base.api.imageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.movieGallery.model.MovieGalleryComment;

public class ImageGalleryCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryComment> ListItems;

    @SerializedName("Main")
    public MovieGalleryComment Item;
}

package ntk.base.api.movieGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.movieGallery.viewModel.MovieGalleryComment;

public class MovieGalleryCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryComment> ListItems;

    @SerializedName("Item")
    public MovieGalleryComment Item;
}

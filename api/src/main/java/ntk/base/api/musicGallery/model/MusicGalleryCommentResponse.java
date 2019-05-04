package ntk.base.api.musicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.movieGallery.model.MovieGalleryComment;

public class MusicGalleryCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryComment> ListItems;

    @SerializedName("Main")
    public MovieGalleryComment Item;
}

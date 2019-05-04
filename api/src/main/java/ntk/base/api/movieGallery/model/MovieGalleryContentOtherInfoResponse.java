package ntk.base.api.movieGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class MovieGalleryContentOtherInfoResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryContentOtherInfo> ListItems;

    @SerializedName("Main")
    public MovieGalleryContentOtherInfo Item;
}

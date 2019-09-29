package ntk.base.api.movieGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.movieGallery.viewModel.MovieGalleryContentOtherInfo;

public class MovieGalleryContentOtherInfoResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MovieGalleryContentOtherInfo> ListItems;

    @SerializedName("Item")
    public MovieGalleryContentOtherInfo Item;
}

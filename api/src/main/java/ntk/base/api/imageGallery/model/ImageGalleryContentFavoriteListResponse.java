package ntk.base.api.imageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.movieGallery.model.MovieGalleryContent;

public class ImageGalleryContentFavoriteListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ImageGalleryContent> ListItems;

    @SerializedName("Item")
    public ImageGalleryContent Item;
}

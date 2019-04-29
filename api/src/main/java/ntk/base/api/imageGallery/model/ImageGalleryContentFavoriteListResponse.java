package ntk.base.api.imageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ImageGalleryContentFavoriteListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ntk.base.api.imageGallery.model.MovieGalleryContent> ListItems;

    @SerializedName("Item")
    public ntk.base.api.imageGallery.model.MovieGalleryContent Item;
}

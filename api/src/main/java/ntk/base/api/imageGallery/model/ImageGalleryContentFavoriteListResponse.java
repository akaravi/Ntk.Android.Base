package ntk.base.api.imageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.imageGallery.entity.ImageGalleryContent;

public class ImageGalleryContentFavoriteListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ImageGalleryContent> ListItems;

    @SerializedName("Item")
    public ImageGalleryContent Item;
}

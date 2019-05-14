package ntk.base.api.imageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ImageGalleryContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ImageGalleryContent> ListItems;

    @SerializedName("Item")
    public ImageGalleryContent Item;
}

package ntk.base.api.imageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ImageGalleryCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ImageGalleryComment> ListItems;

    @SerializedName("Item")
    public ImageGalleryComment Item;
}

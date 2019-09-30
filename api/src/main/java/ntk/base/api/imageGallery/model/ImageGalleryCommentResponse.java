package ntk.base.api.imageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.imageGallery.entity.ImageGalleryComment;

public class ImageGalleryCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ImageGalleryComment> ListItems;

    @SerializedName("Item")
    public ImageGalleryComment Item;
}

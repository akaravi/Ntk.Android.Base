package ntk.base.api.imageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.imageGallery.viewModel.ImageGalleryTag;

public class ImageGalleryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ImageGalleryTag> ListItems;

    @SerializedName("Item")
    public ImageGalleryTag Item;
}

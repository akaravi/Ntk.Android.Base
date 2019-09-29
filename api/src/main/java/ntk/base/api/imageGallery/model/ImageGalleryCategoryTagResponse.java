package ntk.base.api.imageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.imageGallery.viewModel.ImageGalleryCategoryTag;

public class ImageGalleryCategoryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ImageGalleryCategoryTag> ListItems;

    @SerializedName("Item")
    public ImageGalleryCategoryTag Item;
}

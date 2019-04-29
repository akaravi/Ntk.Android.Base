package ntk.base.api.imageGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ImageGalleryCategoryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ntk.base.api.imageGallery.model.MovieGalleryCategoryTag> ListItems;

    @SerializedName("Item")
    public ntk.base.api.imageGallery.model.MovieGalleryCategoryTag Item;
}

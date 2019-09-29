package ntk.base.api.musicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.musicGallery.viewModel.MusicGalleryCategory;

public class MusicGalleryCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MusicGalleryCategory> ListItems;

    @SerializedName("Item")
    public MusicGalleryCategory Item;
}

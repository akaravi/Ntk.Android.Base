package ntk.base.api.musicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class MusicGalleryCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MusicGalleryCategory> ListItems;

    @SerializedName("Item")
    public MusicGalleryCategory Item;
}

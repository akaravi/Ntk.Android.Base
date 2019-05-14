package ntk.base.api.musicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class MusicGalleryCategoryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MusicGalleryCategoryTag> ListItems;

    @SerializedName("Item")
    public MusicGalleryCategoryTag Item;
}

package ntk.base.api.musicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.musicGallery.entity.MusicGalleryContent;

public class MusicGalleryContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MusicGalleryContent> ListItems;

    @SerializedName("Item")
    public MusicGalleryContent Item;
}

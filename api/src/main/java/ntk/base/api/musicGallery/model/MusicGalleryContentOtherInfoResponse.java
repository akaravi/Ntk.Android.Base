package ntk.base.api.musicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class MusicGalleryContentOtherInfoResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MusicGalleryContentOtherInfo> ListItems;

    @SerializedName("Item")
    public MusicGalleryContentOtherInfo Item;
}

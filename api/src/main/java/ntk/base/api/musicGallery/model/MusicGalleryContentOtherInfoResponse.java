package ntk.base.api.musicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.musicGallery.entity.MusicGalleryContentOtherInfo;

public class MusicGalleryContentOtherInfoResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MusicGalleryContentOtherInfo> ListItems;

    @SerializedName("Item")
    public MusicGalleryContentOtherInfo Item;
}

package ntk.base.api.musicGallery.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.musicGallery.entity.MusicGalleryComment;

public class MusicGalleryCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<MusicGalleryComment> ListItems;

    @SerializedName("Item")
    public MusicGalleryComment Item;
}

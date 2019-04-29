package ntk.base.api.imageGallery.model;

import com.google.gson.annotations.SerializedName;

public class ImageGalleryCommentAddRequest {

    @SerializedName("LinkContentId")
    public Long LinkContentId;

    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("Writer")
    public String Writer;

    @SerializedName("Comment")
    public String Comment;

}

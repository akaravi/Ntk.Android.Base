package ntk.base.api.movieGallery.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseEntity;

public class MovieGalleryComment extends BaseEntity {

    @SerializedName("LinkContentId")
    public Long LinkContentId;

    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("Writer")
    public String Writer;

    @SerializedName("Comment")
    public String Comment;

    @SerializedName("RegisterDate")
    public String RegisterDate;

    @SerializedName("SumLikeClick")
    public int SumLikeClick;

    @SerializedName("SumDisLikeClick")
    public int SumDisLikeClick;

    @SerializedName("Id")
    public Long Id;
}

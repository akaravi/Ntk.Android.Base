package ntk.base.api.service.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseEntity;

public class ServiceComment extends BaseEntity {

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

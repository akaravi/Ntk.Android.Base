package ntk.android.base.entitymodel.news;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class NewsCommentModel extends BaseModuleEntity<Long> {
    @SerializedName("LinkContentId")
    public long LinkContentId;
    @SerializedName("LinkParentId")
    public Long LinkParentId;
    @SerializedName("Writer")
    public String Writer;
    @SerializedName("Comment")
    public String Comment;
    @SerializedName("RegisterDate")
    public String RegisterDate;
    @SerializedName("SumLikeClick")
    public long SumLikeClick;
    @SerializedName("SumDisLikeClick")
    public long SumDisLikeClick;
    @SerializedName("Virtual_Content")
    public NewsContentModel Virtual_Content;
    @SerializedName("Content")
    public NewsContentModel Content;
}

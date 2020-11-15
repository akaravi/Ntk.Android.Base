package ntk.android.base.entitymodel.article;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class ArticleCommentModel extends BaseModuleEntity<Long> {
    @SerializedName("LinkContentid")
    public long LinkContentid;
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
    public ArticleContentModel Virtual_Content;
    @SerializedName("Content")
    public ArticleContentModel Content;
}

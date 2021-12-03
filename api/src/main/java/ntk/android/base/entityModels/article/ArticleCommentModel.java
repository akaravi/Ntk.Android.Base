package ntk.android.base.entitymodel.article;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class ArticleCommentModel extends BaseModuleEntity<Long> {
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
    @SerializedName(" virtual_Content")
    public ArticleContentModel  virtual_Content;
    @SerializedName("Content")
    public ArticleContentModel Content;
}

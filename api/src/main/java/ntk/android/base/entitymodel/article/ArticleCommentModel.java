package ntk.android.base.entitymodel.article;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class ArticleCommentModel extends BaseModuleEntity<Long> {
    @SerializedName("linkContentid")
    public long linkContentid;
    @SerializedName("linkParentId")
    public Long linkParentId;
    @SerializedName("writer")
    public String writer;
    @SerializedName("comment")
    public String comment;
    @SerializedName("registerDate")
    public String registerDate;
    @SerializedName("sumLikeClick")
    public long sumLikeClick;
    @SerializedName("sumDisLikeClick")
    public long sumDisLikeClick;
    @SerializedName("virtual_Content")
    public ArticleContentModel virtual_Content;
    @SerializedName("Content")
    public ArticleContentModel Content;
}

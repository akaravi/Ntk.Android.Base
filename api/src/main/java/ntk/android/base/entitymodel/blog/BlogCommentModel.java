package ntk.android.base.entitymodel.blog;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class BlogCommentModel extends BaseModuleEntity<Long> {
    @SerializedName("LinkContentid")
    public long LinkContentid;
    @SerializedName("linkParentId")
    public Long LinkParentId;
    @SerializedName("writer")
    public String Writer;
    @SerializedName("comment")
    public String Comment;
    @SerializedName("registerDate")
    public String RegisterDate;
    @SerializedName("SumLikeClick")
    public long SumLikeClick;
    @SerializedName("SumDisLikeClick")
    public long SumDisLikeClick;
    @SerializedName(" virtual_Content")
    public BlogContentModel  virtual_Content;
    @SerializedName("Content")
    public BlogContentModel Content;
}

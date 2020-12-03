package ntk.android.base.entitymodel.biography;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class BiographyCommentModel extends BaseModuleEntity<Long> {
    @SerializedName("LinkContentId")
    public long LinkContentId;
    @SerializedName("LinkParentId")
    public long LinkParentId;
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
    @SerializedName("virtual_Content")
    public BiographyContentModel virtual_Content;
    @SerializedName("Content")
    public BiographyContentModel Content;
}

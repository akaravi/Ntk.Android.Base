package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

public class NewsCommentAddRequest {

    @SerializedName("LinkContentId")
    public Long LinkContentId;

    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("Writer")
    public String Writer;

    @SerializedName("Comment")
    public String Comment;

}

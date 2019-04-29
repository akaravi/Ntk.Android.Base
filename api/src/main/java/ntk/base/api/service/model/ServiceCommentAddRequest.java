package ntk.base.api.service.model;

import com.google.gson.annotations.SerializedName;

public class ServiceCommentAddRequest {

    @SerializedName("LinkContentId")
    public Long LinkContentId;

    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("Writer")
    public String Writer;

    @SerializedName("Comment")
    public String Comment;

}

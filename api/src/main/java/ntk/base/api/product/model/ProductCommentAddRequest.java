package ntk.base.api.product.model;

import com.google.gson.annotations.SerializedName;

public class ProductCommentAddRequest {

    @SerializedName("LinkContentId")
    public Long LinkContentId;

    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("Writer")
    public String Writer;

    @SerializedName("Comment")
    public String Comment;

}

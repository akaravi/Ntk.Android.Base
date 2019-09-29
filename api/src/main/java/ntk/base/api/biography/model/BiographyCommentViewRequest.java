package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

public class BiographyCommentViewRequest{

    @SerializedName("Id")
    public Long Id;

    @SerializedName("ActionClientOrder")
    public int ActionClientOrder;
}

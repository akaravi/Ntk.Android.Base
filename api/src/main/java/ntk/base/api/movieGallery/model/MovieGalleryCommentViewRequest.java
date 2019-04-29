package ntk.base.api.movieGallery.model;

import com.google.gson.annotations.SerializedName;

public class MovieGalleryCommentViewRequest {

    @SerializedName("Id")
    public Long Id;

    @SerializedName("ActionClientOrder")
    public int ActionClientOrder;
}

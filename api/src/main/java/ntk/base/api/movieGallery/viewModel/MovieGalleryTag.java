package ntk.base.api.movieGallery.viewModel;

import com.google.gson.annotations.SerializedName;

public class MovieGalleryTag {

    @SerializedName("Id")
    public long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkCategoryTagId")
    public String LinkCategoryTagId;
}

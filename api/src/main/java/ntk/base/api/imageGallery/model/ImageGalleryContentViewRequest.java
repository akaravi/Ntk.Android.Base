package ntk.base.api.imageGallery.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.FilterModel;

public class ImageGalleryContentViewRequest extends FilterModel {

    @SerializedName("Id")
    public long Id;

    @SerializedName("ActionClientOrder")
    public int ActionClientOrder;

    @SerializedName("ScorePercent")
    public int ScorePercent;
}

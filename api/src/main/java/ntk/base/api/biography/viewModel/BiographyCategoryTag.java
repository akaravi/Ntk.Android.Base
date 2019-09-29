package ntk.base.api.biography.viewModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseEntity;

public class BiographyCategoryTag  extends BaseEntity {

    @SerializedName("Id")
    public long Id;

    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("Title")
    public String Title;

    @SerializedName("MainImageSrc")
    public String imageSrc;

    @SerializedName("LinkMainImageId")
    public String LinkMainImageId;

    @SerializedName("LinkMainImageSrc")
    public String LinkMainImageSrc;

    @SerializedName("Children")
    public List<BiographyCategoryTag> Children;
}

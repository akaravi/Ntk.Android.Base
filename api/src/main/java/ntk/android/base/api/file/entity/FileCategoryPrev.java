package ntk.android.base.api.file.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.BaseEntityPrev;

public class FileCategoryPrev extends BaseEntityPrev {

    @SerializedName("Id")
    public long Id;

    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkMainImageIdSrc")
    public String imageSrc;

    @SerializedName("LinkMainImageId")
    public String LinkMainImageId;

    @SerializedName("LinkLinkMainImageIdSrc")
    public String LinkLinkMainImageIdSrc;

    @SerializedName("Children")
    public List<FileCategoryPrev> Children;
}

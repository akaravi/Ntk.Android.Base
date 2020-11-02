package ntk.android.base.api.pooling.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.BaseEntity;

public class PoolingContent  extends BaseEntity {

    @SerializedName("Id")
    public long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("Question")
    public String Question;

    @SerializedName("Keyword")
    public String Keywword;

    @SerializedName("FromDate")
    public String FromDate;

    @SerializedName("ToDate")
    public String ToDate;

    @SerializedName("LinkCategoryId")
    public Long LinkCategoryId;

    @SerializedName("ViewStatisticsBeforeVote")
    public Boolean ViewStatisticsBeforeVote;

    @SerializedName("ViewStatisticsAfterVote")
    public Boolean ViewStatisticsAfterVote;

    @SerializedName("virtual_Category")
    public PoolingCategory virtual_Category;

    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;

    @SerializedName("LinkFileIds")
    public String LinkFileIds;

    @SerializedName("MaxVoteForThisContent")
    public int MaxVoteForThisContent;

    @SerializedName("MaxVoteForEachOption")
    public int MaxVoteForEachOption;

    @SerializedName("Options")
    public List<PoolingOption> Options;

    @SerializedName("MainImageSrc")
    public String MainImageSrc;

    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;


}

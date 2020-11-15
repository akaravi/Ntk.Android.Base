package ntk.android.base.entitymodel.polling;


import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class PollingContentModel extends BaseModuleEntity<Long> {

    @SerializedName("Source")
    public String Source;
    @SerializedName("ExpireDate")
    public String ExpireDate;
    @SerializedName("ViewStatisticsBeforeVote")
    public boolean ViewStatisticsBeforeVote;
    @SerializedName("ViewStatisticsAfterVote")
    public boolean ViewStatisticsAfterVote;
    @SerializedName("Virtual_Category")
    public PollingCategoryModel Virtual_Category;
    @SerializedName("Category")
    public PollingCategoryModel Category;
    @SerializedName("Body")
    public String Body;
    @SerializedName("Description")
    public String Description;
    @SerializedName("FromDate")
    public String FromDate;
    @SerializedName("Geolocationlatitude")
    public Long Geolocationlatitude;
    @SerializedName("Geolocationlongitude")
    public Long Geolocationlongitude;
    @SerializedName("Keyword")
    public String Keyword;
    @SerializedName("LinkCategoryId")
    public Long LinkCategoryId;
    @SerializedName("LinkFileIds")
    public String LinkFileIds;
    @SerializedName("LinkFilePodcastId")
    public Long LinkFilePodcastId;
    @SerializedName("LinkFileMovieId")
    public Long LinkFileMovieId;
    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;
    @SerializedName("ScoreClick")
    public long ScoreClick;
    @SerializedName("ScoreSumPercent")
    public long ScoreSumPercent;
    @SerializedName("Title")
    public String Title;
    @SerializedName("ViewCount")
    public int ViewCount;
    @SerializedName("Favorited")
    public boolean Favorited;
    @SerializedName("MainImageSrc")
    public String MainImageSrc;
    @SerializedName("LinkFilePodcastIdSrc")
    public String LinkFilePodcastIdSrc;
    @SerializedName("LinkFileMovieIdSrc")
    public String LinkFileMovieIdSrc;
    @SerializedName("LinkFileIdsSrc")
    public String LinkFileIdsSrc;
    @SerializedName("Question")
    public String Question;
    @SerializedName("MaxVoteForThisContent")
    public long MaxVoteForThisContent;
    @SerializedName("MaxVoteForEachOption")
    public long MaxVoteForEachOption;
    @SerializedName("Options")
    public List<PollingOptionModel> Options;
}

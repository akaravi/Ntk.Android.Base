package ntk.android.base.entitymodel.polling;


import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class PollingContentModel extends BaseModuleEntity<Long> {

    @SerializedName("Source")
    public String Source;
    @SerializedName("expireDate")
    public String expireDate;
    @SerializedName("viewStatisticsBeforeVote")
    public boolean viewStatisticsBeforeVote;
    @SerializedName("viewStatisticsAfterVote")
    public boolean viewStatisticsAfterVote;
    @SerializedName("virtual_Category")
    public PollingCategoryModel virtual_Category;
    @SerializedName("category")
    public PollingCategoryModel category;
    @SerializedName("body")
    public String body;
    @SerializedName("description")
    public String description;
    @SerializedName("fromDate")
    public String fromDate;
    @SerializedName("geolocationlatitude")
    public Long geolocationlatitude;
    @SerializedName("geolocationlongitude")
    public Long geolocationlongitude;
    @SerializedName("keyword")
    public String keyword;
    @SerializedName("linkCategoryId")
    public Long linkCategoryId;
    @SerializedName("linkFileIds")
    public String linkFileIds;
    @SerializedName("linkFilePodcastId")
    public Long linkFilePodcastId;
    @SerializedName("linkFileMovieId")
    public Long linkFileMovieId;
    @SerializedName("linkMainImageId")
    public Long linkMainImageId;
    @SerializedName("scoreClick")
    public long scoreClick;
    @SerializedName("scoreSumPercent")
    public long scoreSumPercent;
    @SerializedName("title")
    public String title;
    @SerializedName("viewCount")
    public int viewCount;
    @SerializedName("favorited")
    public boolean favorited;
    @SerializedName("mainImageSrc")
    public String mainImageSrc;
    @SerializedName("linkFilePodcastIdSrc")
    public String linkFilePodcastIdSrc;
    @SerializedName("linkFileMovieIdSrc")
    public String linkFileMovieIdSrc;
    @SerializedName("linkFileIdsSrc")
    public String linkFileIdsSrc;
    @SerializedName("question")
    public String question;
    @SerializedName("maxVoteForThisContent")
    public long maxVoteForThisContent;
    @SerializedName("maxVoteForEachOption")
    public long maxVoteForEachOption;
    @SerializedName("options")
    public List<PollingOptionModel> options;
}

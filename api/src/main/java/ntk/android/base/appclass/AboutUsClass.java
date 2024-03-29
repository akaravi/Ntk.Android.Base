package ntk.android.base.appclass;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.application.ApplicationAppModel;

public class AboutUsClass {
    @SerializedName("AboutUsTitle")
    public String AboutUsTitle;
    @SerializedName("AboutUsDescription")
    public String AboutUsDescription;
    @SerializedName("AboutUsTel")
    public String AboutUsTel;
    @SerializedName("AboutUsFax")
    public String AboutUsFax;
    @SerializedName("AboutUsEmail")
    public String AboutUsEmail;
    @SerializedName("AboutUsAddress")
    public String AboutUsAddress;
    @SerializedName("AboutUsLinkImageId")
    public String AboutUsLinkImageId;
    @SerializedName("AboutUsGeolocationlatetitude")
    public String AboutUsGeolocationlatetitude;
    @SerializedName("AboutUsGeolocationlongitude")
    public String AboutUsGeolocationlongitude;
    @SerializedName("AboutUsScoreClick")
    public int AboutUsScoreClick;
    @SerializedName("AboutUsScoreSum")
    public Long AboutUsScoreSum;
    @SerializedName("AboutUsPrivacyPolicyHtmlBody")
    public String AboutUsPrivacyPolicyHtmlBody;

    public AboutUsClass(ApplicationAppModel item) {
        this.AboutUsTitle = item.Title;
        this.AboutUsAddress = item.AboutUsAddress;
        this.AboutUsDescription = item.AboutUsDescription;
        this.AboutUsEmail = item.AboutUsEmail;
        this.AboutUsFax = item.AboutUsFax;
        this.AboutUsTel = item.AboutUsTel;
        this.AboutUsGeolocationlatetitude = item.AboutUsGeolocationlatetitude;
        this.AboutUsGeolocationlongitude = item.AboutUsGeolocationlongitude;
        this.AboutUsLinkImageId = item.AboutUsLinkImageId;
        this.AboutUsScoreClick = item.ScoreClick;
        this.AboutUsScoreSum = item.ScoreSumPercent;
        this.AboutUsPrivacyPolicyHtmlBody = item.AboutUsPrivacyPolicyHtmlBody;
        if (this.AboutUsPrivacyPolicyHtmlBody == null)
            this.AboutUsPrivacyPolicyHtmlBody = "";
    }
}

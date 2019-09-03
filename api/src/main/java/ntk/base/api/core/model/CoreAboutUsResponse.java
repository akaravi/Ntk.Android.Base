package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.article.model.ArticleContent;
import ntk.base.api.model.ErrorException;

public class CoreAboutUsResponse extends ErrorException {

    @SerializedName("Item")
    public About Item;
}
class About {
    @SerializedName("Id")
    public long Id;

    @SerializedName("WebUrl")
    public String WebUrl;

    @SerializedName("LogoUrl")
    public String LogoUrl;

    @SerializedName("Content")
    public String Content;

    @SerializedName("Email")
    public String Email;

    @SerializedName("Instagram")
    public String Instagram;

    @SerializedName("Telegram")
    public String Telegram;

    @SerializedName("Tel1")
    public String Tel1;

    @SerializedName("Tel2")
    public String Tel2;

    @SerializedName("OfficeNo")
    public String OfficeNo;

    @SerializedName("MobileNo")
    public String MobileNo;

    @SerializedName("Address")
    public String Address;
}
package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class NewsContentOtherInfoResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsContentOtherInfo> ListItems;

    @SerializedName("Main")
    public NewsContentOtherInfo Item;
}

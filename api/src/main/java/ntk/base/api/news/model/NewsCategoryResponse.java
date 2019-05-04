package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class NewsCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsCategory> ListItems;

    @SerializedName("Main")
    public NewsCategory Item;
}

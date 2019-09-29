package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.news.viewModel.NewsCategory;

public class NewsCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsCategory> ListItems;

    @SerializedName("Item")
    public NewsCategory Item;
}

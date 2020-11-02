package ntk.android.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.news.entity.NewsCategory;

public class NewsCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsCategory> ListItems;

    @SerializedName("Item")
    public NewsCategory Item;
}

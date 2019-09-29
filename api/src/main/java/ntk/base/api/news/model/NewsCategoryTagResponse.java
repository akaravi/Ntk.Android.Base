package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.news.viewModel.NewsCategoryTag;

public class NewsCategoryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsCategoryTag> ListItems;

    @SerializedName("Item")
    public NewsCategoryTag Item;
}

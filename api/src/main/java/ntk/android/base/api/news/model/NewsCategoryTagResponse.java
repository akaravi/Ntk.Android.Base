package ntk.android.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.news.entity.NewsCategoryTag;

public class NewsCategoryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsCategoryTag> ListItems;

    @SerializedName("Item")
    public NewsCategoryTag Item;
}

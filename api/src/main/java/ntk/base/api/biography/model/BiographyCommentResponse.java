package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.biography.viewModel.BiographyComment;

public class BiographyCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyComment> ListItems;

    @SerializedName("Item")
    public BiographyComment Item;
}

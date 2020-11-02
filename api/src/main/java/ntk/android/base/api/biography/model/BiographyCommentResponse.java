package ntk.android.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.biography.entity.BiographyComment;

public class BiographyCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyComment> ListItems;

    @SerializedName("Item")
    public BiographyComment Item;
}

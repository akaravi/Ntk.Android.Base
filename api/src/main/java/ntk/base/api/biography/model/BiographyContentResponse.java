package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.biography.entity.BiographyContent;

public class BiographyContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyContent> ListItems;

    @SerializedName("Item")
    public BiographyContent Item;
}

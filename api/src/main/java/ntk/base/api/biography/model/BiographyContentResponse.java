package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.biography.model.BiographyContent;
import ntk.base.api.model.ErrorException;

public class BiographyContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyContent> ListItems;

    @SerializedName("Main")
    public BiographyContent Item;
}

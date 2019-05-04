package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class BiographyCategoryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyCategoryTag> ListItems;

    @SerializedName("Main")
    public BiographyCategoryTag Item;
}

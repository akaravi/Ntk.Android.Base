package ntk.base.api.application.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ApplicationIntroResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<ApplicationIntro> ListItems;

    @SerializedName("Item")
    public ApplicationIntro Item;
}

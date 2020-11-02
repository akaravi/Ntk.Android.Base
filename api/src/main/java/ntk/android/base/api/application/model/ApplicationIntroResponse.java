package ntk.android.base.api.application.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.application.entity.ApplicationIntro;
import ntk.android.base.api.baseModel.ErrorException;

public class ApplicationIntroResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<ApplicationIntro> ListItems;

    @SerializedName("Item")
    public ApplicationIntro Item;
}

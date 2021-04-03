package ntk.android.base.api.application.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.application.entity.PrevApplicationIntro;
import ntk.android.base.api.baseModel.ErrorExceptionPrev;

public class PrevApplicationIntroResponse extends ErrorExceptionPrev {
    @SerializedName("ListItems")
    public List<PrevApplicationIntro> ListItems;

    @SerializedName("Item")
    public PrevApplicationIntro Item;
}

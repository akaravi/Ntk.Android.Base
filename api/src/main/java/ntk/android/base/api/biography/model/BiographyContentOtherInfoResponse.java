package ntk.android.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.biography.entity.BiographyContentOtherInfo;

public class BiographyContentOtherInfoResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyContentOtherInfo> ListItems;

    @SerializedName("Item")
    public BiographyContentOtherInfo Item;
}

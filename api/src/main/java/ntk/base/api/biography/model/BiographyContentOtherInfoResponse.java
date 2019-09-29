package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.biography.viewModel.BiographyContentOtherInfo;

public class BiographyContentOtherInfoResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BiographyContentOtherInfo> ListItems;

    @SerializedName("Item")
    public BiographyContentOtherInfo Item;
}

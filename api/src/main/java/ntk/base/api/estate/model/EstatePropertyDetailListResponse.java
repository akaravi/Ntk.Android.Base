package ntk.base.api.estate.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.estate.viewModel.EstatePropertyDetail;

public class EstatePropertyDetailListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<EstatePropertyDetail> ListItems;

    @SerializedName("Item")
    public EstatePropertyDetail Item;
}

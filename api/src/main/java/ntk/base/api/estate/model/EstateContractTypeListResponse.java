package ntk.base.api.estate.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.estate.viewModel.EstateContractType;

public class EstateContractTypeListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<EstateContractType> ListItems;

    @SerializedName("Item")
    public EstateContractType Item;
}

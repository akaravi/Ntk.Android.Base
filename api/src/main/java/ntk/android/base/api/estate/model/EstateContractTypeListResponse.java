package ntk.android.base.api.estate.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.estate.entity.EstateContractType;

public class EstateContractTypeListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<EstateContractType> ListItems;

    @SerializedName("Item")
    public EstateContractType Item;
}

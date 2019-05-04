package ntk.base.api.estate.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class EstateContractTypeResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<EstateContractType> ListItems;

    @SerializedName("Main")
    public EstateContractType Item;
}

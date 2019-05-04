package ntk.base.api.estate.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class EstatePropertyDetailListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<EstatePropertyDetail> ListItems;

    @SerializedName("Main")
    public EstatePropertyDetail Item;
}

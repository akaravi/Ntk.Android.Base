package ntk.base.api.service.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ServiceCategoryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ServiceCategoryTag> ListItems;

    @SerializedName("Item")
    public ServiceCategoryTag Item;
}

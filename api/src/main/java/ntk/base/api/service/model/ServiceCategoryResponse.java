package ntk.base.api.service.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ServiceCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ServiceCategory> ListItems;

    @SerializedName("Item")
    public ServiceCategory Item;
}

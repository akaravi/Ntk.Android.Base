package ntk.base.api.service.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.service.viewModel.ServiceCategory;

public class ServiceCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ServiceCategory> ListItems;

    @SerializedName("Item")
    public ServiceCategory Item;
}

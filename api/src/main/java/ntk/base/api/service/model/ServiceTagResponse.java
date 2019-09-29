package ntk.base.api.service.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.service.viewModel.ServiceTag;

public class ServiceTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ServiceTag> ListItems;

    @SerializedName("Item")
    public ServiceTag Item;
}

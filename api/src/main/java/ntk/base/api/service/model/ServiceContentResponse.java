package ntk.base.api.service.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ServiceContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ServiceContent> ListItems;

    @SerializedName("Item")
    public ServiceContent Item;
}

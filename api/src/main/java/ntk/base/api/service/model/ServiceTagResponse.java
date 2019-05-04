package ntk.base.api.service.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ServiceTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ServiceTag> ListItems;

    @SerializedName("Main")
    public ServiceTag Item;
}

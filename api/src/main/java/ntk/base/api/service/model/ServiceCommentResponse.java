package ntk.base.api.service.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ServiceCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ServiceComment> ListItems;

    @SerializedName("Main")
    public ServiceComment Item;
}

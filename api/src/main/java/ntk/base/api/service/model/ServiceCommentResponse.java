package ntk.base.api.service.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.service.entity.ServiceComment;

public class ServiceCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ServiceComment> ListItems;

    @SerializedName("Item")
    public ServiceComment Item;
}

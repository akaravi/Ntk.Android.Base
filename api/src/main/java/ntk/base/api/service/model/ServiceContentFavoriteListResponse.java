package ntk.base.api.service.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.service.entity.ServiceContent;

public class ServiceContentFavoriteListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ServiceContent> ListItems;

    @SerializedName("Item")
    public ServiceContent Item;
}

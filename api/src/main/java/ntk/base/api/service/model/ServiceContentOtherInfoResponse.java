package ntk.base.api.service.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.service.entity.ServiceContentOtherInfo;

public class ServiceContentOtherInfoResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ServiceContentOtherInfo> ListItems;

    @SerializedName("Item")
    public ServiceContentOtherInfo Item;
}

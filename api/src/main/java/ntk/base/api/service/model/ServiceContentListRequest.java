package ntk.base.api.service.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.FilterModel;

public class ServiceContentListRequest extends FilterModel {

    @SerializedName("TagIds")
    public List<Long> TagIds;
}

package ntk.base.api.service.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.FilterModel;

public class ServiceContentSimilarListRequest extends FilterModel {

    @SerializedName("LinkContentId")
    public Long LinkContentId;
}

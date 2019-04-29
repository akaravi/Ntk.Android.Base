package ntk.base.api.product.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.FilterModel;

public class ProductContentSimilarListRequest extends FilterModel {

    @SerializedName("LinkContentId")
    public Long LinkContentId;
}

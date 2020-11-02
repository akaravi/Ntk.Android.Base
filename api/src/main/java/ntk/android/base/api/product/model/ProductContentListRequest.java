package ntk.android.base.api.product.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.FilterModel;

public class ProductContentListRequest extends FilterModel {

    @SerializedName("TagIds")
    public List<Long> TagIds;
}

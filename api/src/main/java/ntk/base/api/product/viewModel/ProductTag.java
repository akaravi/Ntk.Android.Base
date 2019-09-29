package ntk.base.api.product.viewModel;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseEntity;

public class ProductTag extends BaseEntity {

    @SerializedName("Id")
    public long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkCategoryTagId")
    public String LinkCategoryTagId;
}

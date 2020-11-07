package ntk.android.base.entitymodel.shop;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

/**
 * Created by karavi on 12/14/2017.
 */

public class ShopProductItemCombine extends BaseModuleEntity<Long> {
    @SerializedName("LinkProductCombineId")
    public long LinkProductCombineId;
    @SerializedName("LinkProductItemId")
    public long LinkProductItemId;
    @SerializedName("ProductItemCount")
    public Float ProductItemCount;
    @SerializedName("ProductCombine")
    public  ShopProductCombine ProductCombine;
    @SerializedName("ProductItem")
    public  ShopProductItem ProductItem;
}

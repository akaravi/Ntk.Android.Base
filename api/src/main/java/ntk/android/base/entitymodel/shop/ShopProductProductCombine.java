package ntk.android.base.entitymodel.shop;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

/**
 * Created by karavi on 12/14/2017.
 */

public class ShopProductProductCombine  extends BaseModuleEntity<Long> {
   @SerializedName("LinkProductCombineId")
    public long LinkProductCombineId ;
    @SerializedName("LinkProductId")
    public long LinkProductId ;
    @SerializedName("ProductCombines")
    public  ShopProductCombine ProductCombines ;
    @SerializedName("Products")
    public  ShopContent Products ;
}

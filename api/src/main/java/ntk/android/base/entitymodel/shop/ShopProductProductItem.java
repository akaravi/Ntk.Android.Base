package ntk.android.base.entitymodel.shop;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

/**
 * Created by karavi on 12/14/2017.
 */

public class ShopProductProductItem  extends BaseModuleEntity<Long> {
   @SerializedName("LinkProductItemId")
    public long LinkProductItemId ;

    @SerializedName("LinkProductId")
    public long LinkProductId ;
    @SerializedName("ProductItem")
    public  ShopProductItem ProductItem ;
    @SerializedName("Content")
    public  ShopContent Content ;
}

package ntk.android.base.entitymodel.shop;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

/**
 * Created by karavi on 12/14/2017.
 */

public class ShopProductSalePrice extends BaseModuleEntity<Long> {
     @SerializedName("LinkProductId")
    public Long LinkProductId ;
     @SerializedName(" virtual_Product")
    public ShopContent  virtual_Product ;
     @SerializedName("SalePrice")
    public float SalePrice ;
     @SerializedName("LinkPersonGroupId")
    public long LinkPersonGroupId ;
}

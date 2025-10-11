package ntk.android.base.entitymodel.shop;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

/**
 * Created by karavi on 12/14/2017.
 */

public class ShopProductProductService extends BaseModuleEntity<Long> {
    @SerializedName("LinkProductServiceId")
    public long LinkProductServiceId;
    @SerializedName("LinkProductId")
    public long LinkProductId;
    @SerializedName("ProductService")
    public  ShopProductService ProductService;
    @SerializedName("Content")
    public ShopContent Content;
}

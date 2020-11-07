package ntk.android.base.entitymodel.shop;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

/**
 * Created by karavi on 12/14/2017.
 */

public class ShopProductProductProcess extends BaseModuleEntity<Long> {
    @SerializedName("LinkProductProcessId")
    public long LinkProductProcessId;
    @SerializedName("LinkProductId")
    public long LinkProductId;
    @SerializedName("ProductProcess")
    public  ShopProductProcess ProductProcess;
    @SerializedName("Content")
    public ShopContent Content;
}

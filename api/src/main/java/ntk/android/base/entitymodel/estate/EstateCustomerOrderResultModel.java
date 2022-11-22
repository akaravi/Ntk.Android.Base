package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class EstateCustomerOrderResultModel extends BaseModuleEntity<String> {
    @SerializedName("LinkCustomerOrder")
    public String LinkCustomerOrder;
    @SerializedName("LinkProperty")
    public String LinkProperty;
    @SerializedName("AutoRecordAdd")
    public boolean AutoRecordAdd;
    @SerializedName("LinkCmsUserIdCustomer")
    public Long LinkCmsUserIdCustomer;
    @SerializedName("StatusViewer")
    public boolean StatusViewer;
    @SerializedName("LinkCmsUserIdViewer")
    public Long LinkCmsUserIdViewer;
    @SerializedName("StatusTasked")
    public boolean StatusTasked;
    @SerializedName("LinkCmsUserIdTasked")
    public Long LinkCmsUserIdTasked;
    @SerializedName("Description")
    public String Description;
}

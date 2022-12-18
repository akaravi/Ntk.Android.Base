package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class EstatePropertyHistoryModel extends BaseModuleEntity<String> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("LinkPropertyId")
    public String LinkPropertyId;
    @SerializedName("LinkCustomerOrderId")
    public String LinkCustomerOrderId;
    @SerializedName("LinkAgentId")
    public String LinkAgentId;
    @SerializedName("LinkActivityTypeId")
    public String LinkActivityTypeId;
    @SerializedName("LinkFileIds")
    public String LinkFileIds;
    @SerializedName("ActivityType")
    public EstateActivityTypeModel ActivityType;
    @SerializedName("ActivityStatus")
    public int ActivityStatus;
    @SerializedName("AppointmentDateFrom")
    public String AppointmentDateFrom;
    @SerializedName("AppointmentDateTo")
    public String AppointmentDateTo;
    @SerializedName("Description")
    public String Description;
    @SerializedName("DescriptionHidden")
    public String DescriptionHidden;

}

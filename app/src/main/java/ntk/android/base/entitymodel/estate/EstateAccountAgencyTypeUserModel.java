package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;
import ntk.android.base.entitymodel.enums.EnumEstateUserType;

public class EstateAccountAgencyTypeUserModel extends BaseModuleEntity<String> {
    @SerializedName("AccountUserType")
    public int AccountUserType;
    //not need to serialize
    public EnumEstateUserType AccountUserTypeEnum;
    @SerializedName("LinkAccountUserId")
    public String LinkAccountUserId;
    @SerializedName("LinkAccountAgencyId")
    public String LinkAccountAgencyId;
    @SerializedName("LinkPropertyId")
    public String LinkPropertyId;
}

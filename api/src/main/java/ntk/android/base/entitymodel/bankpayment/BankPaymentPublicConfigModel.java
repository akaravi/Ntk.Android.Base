package ntk.android.base.entitymodel.bankpayment;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseEntity;

class BankPaymentPublicConfigModel extends BaseEntity<Long> {
    @SerializedName("Title")
    String Title;
    @SerializedName("ClassName")
    String ClassName;
    @SerializedName("LinkModuleFileLogoId")
    long LinkModuleFileLogoId;
    @SerializedName("LinkModuleFileLogoIdSrc")
    String LinkModuleFileLogoIdSrc;
    @SerializedName("CurrencyUnit")
    String CurrencyUnit;
    @SerializedName("PublicConfigJsonValues")
    String PublicConfigJsonValues;
    @SerializedName("Memo")
    String Memo;
    @SerializedName("PrivateSiteConfigs")
    List<BankPaymentPrivateSiteConfigModel> PrivateSiteConfigs;

}

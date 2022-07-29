package ntk.android.base.entitymodel.coremain;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreCurrencyModel extends BaseEntity<Integer> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("TitleML")
    public String TitleML;
    @SerializedName("TitleResourceLanguage")
    public String TitleResourceLanguage;
    @SerializedName("Symbol")
    public String Symbol;
    @SerializedName("IsDefault")
    public boolean IsDefault;
    @SerializedName("ExchangeBuyRatio")
    public float ExchangeBuyRatio;
    @SerializedName("ExchangeSaleRatio")
    public float ExchangeSaleRatio;
    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;
    @SerializedName("LinkMainImageIdSrc")
    public String LinkMainImageIdSrc;
    @SerializedName("MasterCurrency")
    public String MasterCurrency;
}

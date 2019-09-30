package ntk.base.api.estate.entity;

import com.google.gson.annotations.SerializedName;

public class EstateContractType {
//    نوع معامله (اجاره رهن فروش)

    @SerializedName("Title")
    public String Title;

    @SerializedName("HasSalePrice")
    public Boolean HasSalePrice;

    @SerializedName("HasPresalePrice")
    public Boolean HasPresalePrice;

    @SerializedName("HasRentPrice")
    public Boolean HasRentPrice;

    @SerializedName("HasDepositPrice")
    public Boolean HasDepositPrice;

    @SerializedName("UnitSalePrice")
    public String UnitSalePrice;
}

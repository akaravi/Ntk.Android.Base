package ntk.android.base.entityModel.core;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.enums.EnumMenuPlaceType;

class CoreCpMainMenuModel {
    @SerializedName("") String Title;
    @SerializedName("")  String TitleML;
    @SerializedName("")  String TitleResourceLanguage;
    @SerializedName("")  String Color;
    @SerializedName("")   String TitleEn;
    @SerializedName("")   String Icon;
    @SerializedName("")    String AddressLink;
    @SerializedName("")    String RouteAddressLink;
    @SerializedName("")    int LinkParentId;
    @SerializedName("")    int LinkModuleId;
    @SerializedName("")   String Description;
    @SerializedName("")   int ShowInMenu;
    @SerializedName("")    int ShowInMenuOrder;
    @SerializedName("")    boolean ShowInAccessAdminAllowToProfessionalData;
    @SerializedName("")    EnumMenuPlaceType MenuPlaceType;
    @SerializedName("")    CoreCpMainMenuModel[] Children;
}

package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.enums.EnumMenuPlaceType;

class CoreCpMainMenuModel {
    @SerializedName("Title")
    String Title;
    @SerializedName("TitleML")
    String TitleML;
    @SerializedName("TitleResourceLanguage")
    String TitleResourceLanguage;
    @SerializedName("Color")
    String Color;
    @SerializedName("TitleEn")
    String TitleEn;
    @SerializedName("Icon")
    String Icon;
    @SerializedName("AddressLink")
    String AddressLink;
    @SerializedName("RouteAddressLink")
    String RouteAddressLink;
    @SerializedName("LinkParentId")
    int LinkParentId;
    @SerializedName("LinkModuleId")
    int LinkModuleId;
    @SerializedName("Description")
    String Description;
    @SerializedName("ShowInMenu")
    int ShowInMenu;
    @SerializedName("ShowInMenuOrder")
    int ShowInMenuOrder;
    @SerializedName("ShowInAccessAdminAllowToProfessionalData")
    boolean ShowInAccessAdminAllowToProfessionalData;
    @SerializedName("MenuPlaceType")
    EnumMenuPlaceType MenuPlaceType;
    @SerializedName("Children")
    CoreCpMainMenuModel[] Children;
}

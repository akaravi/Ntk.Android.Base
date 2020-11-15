package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreSiteCategoryModel extends BaseEntity<Long> {
    public @SerializedName("TitleML")
    String TitleML;
    public @SerializedName("Title")
    String Title;
    public @SerializedName("TitleResourceLanguage")
    String TitleResourceLanguage;
    public @SerializedName("Description")
    String Description;
    public @SerializedName("Sites")
    List<CoreSiteModel> Sites;

}

package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreSiteCategoryModel extends BaseEntity<Long> {
    public @SerializedName("TitleML")
    String TitleML;
    public @SerializedName("Title")
    String Title;
    public @SerializedName("titleResourceLanguage")
    String titleResourceLanguage;
    public @SerializedName("description")
    String description;
    public @SerializedName("sites")
    List<CoreSiteModel> sites;

}

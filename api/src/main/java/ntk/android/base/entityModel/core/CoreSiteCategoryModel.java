package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreSiteCategoryModel extends BaseEntity<Long> {
    public @SerializedName("")
    String TitleML;
    public @SerializedName("")
    String Title;
    public @SerializedName("")
    String titleResourceLanguage;
    public @SerializedName("")
    String description;
    public @SerializedName("")
    List<CoreSiteModel> sites;

}

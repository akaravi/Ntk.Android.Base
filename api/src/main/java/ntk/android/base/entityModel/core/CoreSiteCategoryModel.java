package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreSiteCategoryModel extends BaseEntity<Long> {
    @SerializedName("TitleML")
    public String TitleML;
    @SerializedName("Title")
    public String Title;
    @SerializedName("TitleResourceLanguage")
    public String TitleResourceLanguage;
    @SerializedName("Description")
    public String Description;
    @SerializedName("Sites")
    public List<CoreSiteModel> Sites;

}

package ntk.android.base.api.estate.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EstatePropertyDetail {


    @SerializedName("Id")
    public String Id;

    @SerializedName("LinkPropertyTypeId")
    public String LinkPropertyTypeId;

    @SerializedName("LinkPropertyDetailGroupId")
    public String LinkPropertyDetailGroupId;

    @SerializedName("Title")
    public String Title;

    @SerializedName("IconFont")
    public String IconFont;

    @SerializedName("InputDataType")
    public Integer InputDataType;

    @SerializedName("InvisibleForEndUser")
    public Boolean InvisibleForEndUser;

    @SerializedName("InvisibleForSubmiter")
    public Boolean InvisibleForSubmiter;

    @SerializedName("Unit")
    public String Unit;

    @SerializedName("Required")
    public Boolean Required;

    @SerializedName("IsHistoryable")
    public Boolean IsHistoryable;

    @SerializedName("IsSearchable")
    public Boolean IsSearchable;

    @SerializedName("ShowInFormOrder")
    public int ShowInFormOrder;

    @SerializedName("ConfigValueDefaultValue")
    public List<String> ConfigValueDefaultValue;

    @SerializedName("ConfigValueForceUseDefaultValue")
    public Boolean ConfigValueForceUseDefaultValue;

    @SerializedName("ConfigValueMultipleChoice")
    public Boolean ConfigValueMultipleChoice;

    @SerializedName("ConfigValueIntValueMin")
    public int ConfigValueIntValueMin;

    @SerializedName("ConfigValueIntValueMax")
    public int ConfigValueIntValueMax;
}

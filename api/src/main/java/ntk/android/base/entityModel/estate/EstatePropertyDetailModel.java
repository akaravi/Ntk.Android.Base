package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.enums.EnumInputDataType;

public class EstatePropertyDetailModel {
    @SerializedName("Id")
    public String Id;
    @SerializedName("Title")
    public String Title;

    @SerializedName("Description")
    public String Description;
    @SerializedName("IconFont")
    public String IconFont;
    @SerializedName("IconColor")
    public String IconColor;
    @SerializedName("InputDataType")//0 string //1 int //2 is boolean ,3 is float,4 is date,5 is area
    public int InputDataType;
    public EnumInputDataType InputDataTypeEnum;

    @SerializedName("InvisibleForEndUser")
    public Boolean InvisibleForEndUser;

    @SerializedName("InvisibleForSubmiter")
    public Boolean InvisibleForSubmiter;

    @SerializedName("Unit")
    public String Unit;

    @SerializedName("Required")
    public Boolean Required;

    @SerializedName("IsHistoryable")
    public boolean IsHistoryable;

    @SerializedName("IsSearchable")
    public boolean IsSearchable;
    @SerializedName("ShowInFormOrder")
    public Integer ShowInFormOrder;
    @SerializedName("LinkPropertyTypeLanduseId")
    public String LinkPropertyTypeLanduseId;
    @SerializedName("LinkPropertyDetailGroupId")
    public String LinkPropertyDetailGroupId;
    @SerializedName("ConfigValueDefaultValueJson")
    public String ConfigValueDefaultValueJson;
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

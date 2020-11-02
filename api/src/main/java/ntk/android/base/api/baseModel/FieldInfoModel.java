package ntk.android.base.api.baseModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FieldInfoModel {
    @SerializedName("FieldName")
    public String FieldName;

    @SerializedName("FieldType")
    public String FieldType;

    @SerializedName("FieldTypeClass")
    public String FieldTypeClass;


    @SerializedName("FieldTitle")
    public String FieldTitle;


    @SerializedName("FieldDescription")
    public String FieldDescription;


    @SerializedName("FieldScriptDescription")
    public String FieldScriptDescription;


    @SerializedName("FieldDefaultValue")
    public String FieldDefaultValue;


    @SerializedName("FieldValue")
    public String FieldValue;


    @SerializedName("FieldTypeFullName")
    public String FieldTypeFullName;


    @SerializedName("AccessSearchField")
    public boolean AccessSearchField;


    @SerializedName("AccessWatchField")
    public boolean AccessWatchField;


    @SerializedName("AccessEditField")
    public boolean AccessEditField;


    @SerializedName("AccessDeleteRow")
    public boolean AccessDeleteRow;

    @SerializedName("AccessAddField")
    public boolean AccessAddField;

    @SerializedName("fieldsInfo")
    public List<FieldInfoModel> fieldsInfo;


}
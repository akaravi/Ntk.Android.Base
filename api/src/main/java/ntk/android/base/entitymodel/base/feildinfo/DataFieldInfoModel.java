package ntk.android.base.entitymodel.base.feildinfo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.FieldInfoModelPrev;

public class DataFieldInfoModel {
    @SerializedName("FieldName")
    public    String FieldName;
    @SerializedName("FieldType")
    public    String FieldType;
    @SerializedName("FieldTypeClass")
    public    String FieldTypeClass;
    @SerializedName("FieldTitle")
    public   String FieldTitle;
    @SerializedName("FieldDescription")
    public   String FieldDescription;
    @SerializedName("FieldScriptDescription")
    public   String FieldScriptDescription;
    @SerializedName("FieldDefaultValue")
    public   String FieldDefaultValue;
    @SerializedName("FieldValue")
    public    String FieldValue;
    @SerializedName("FieldTypeFullName")
    public    String FieldTypeFullName;
    @SerializedName("AccessSearchField")
    public    boolean AccessSearchField = false;
    @SerializedName("AccessWatchField")
    public    boolean AccessWatchField = false;
    @SerializedName("AccessEditField")
    public    boolean AccessEditField = false;
    @SerializedName("AccessAddField")
    public    boolean AccessAddField = false;
    @SerializedName("fieldsInfo")
    public  List<FieldInfoModelPrev> fieldsInfo;
}

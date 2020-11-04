package ntk.android.base.entitymodel.base.feildinfo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.FieldInfoModel;

public class DataFieldInfoModel {
    @SerializedName("FieldName")
    String FieldName;
    @SerializedName("FieldType")
    String FieldType;
    @SerializedName("FieldTypeClass")
    String FieldTypeClass;
    @SerializedName("FieldTitle")
    String FieldTitle;
    @SerializedName("FieldDescription")
    String FieldDescription;
    @SerializedName("FieldScriptDescription")
    String FieldScriptDescription;
    @SerializedName("FieldDefaultValue")
    String FieldDefaultValue;
    @SerializedName("FieldValue")
    String FieldValue;
    @SerializedName("FieldTypeFullName")
    String FieldTypeFullName;
    @SerializedName("AccessSearchField")
    boolean AccessSearchField = false;
    @SerializedName("AccessWatchField")
    boolean AccessWatchField = false;
    @SerializedName("AccessEditField")
    boolean AccessEditField = false;
    @SerializedName("AccessAddField")
    boolean AccessAddField = false;
    @SerializedName("fieldsInfo")
    List<FieldInfoModel> fieldsInfo;
}

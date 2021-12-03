package ntk.android.base.entitymodel.base.feildinfo;

import com.google.gson.annotations.SerializedName;

public class GetPropertiesInfoModel extends FieldInfoModel {
    @SerializedName("FieldDataSource")
    public FieldInputDataSourceModel FieldDataSource;
    @SerializedName("FieldDataSourceExpression")
    public String FieldDataSourceExpression;
}

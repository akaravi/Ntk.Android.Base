package ntk.android.base.entitymodel.base.feildinfo;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.FieldInfoModelPrev;

public class GetPropertiesInfoModel extends FieldInfoModelPrev {
    @SerializedName("FieldDataSource")
    public FieldInputDataSourceModel FieldDataSource;
    @SerializedName("FieldDataSourceExpression")
    public String FieldDataSourceExpression;
}

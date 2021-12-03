package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class EstatePropertyAccountTypeUserModel extends BaseModuleEntity<String> {
    @SerializedName("User_Id")
    public String User_Id;
    // tslint:disable-next-line: variable-name
    @SerializedName("Type_Id")
    public String Type_Id;
    // tslint:disable-next-line: variable-name
    @SerializedName("Property_Id")
    public String Property_Id;
}

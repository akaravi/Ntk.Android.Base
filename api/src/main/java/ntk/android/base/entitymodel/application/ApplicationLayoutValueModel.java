package ntk.android.base.entitymodel.application;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class ApplicationLayoutValueModel extends BaseModuleEntity<Long> {

    @SerializedName("LinkApplicationId")
    public long LinkApplicationId;
    @SerializedName("Virtual_Application")
    public ApplicationAppModel Virtual_Application;
    @SerializedName("Application")
    public ApplicationAppModel Application;
    @SerializedName("LinkLayoutId")
    public long LinkLayoutId;
    @SerializedName("Virtual_Layout")
    public ApplicationLayoutModel Virtual_Layout;
    @SerializedName("Layout")
    public ApplicationLayoutModel Layout;
    @SerializedName("JsonFormValues")
    public String JsonFormValues;
}
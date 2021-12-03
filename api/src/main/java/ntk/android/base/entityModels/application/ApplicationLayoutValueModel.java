package ntk.android.base.entitymodel.application;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class ApplicationLayoutValueModel extends BaseModuleEntity<Long> {

    @SerializedName("LinkApplicationId")
    public long LinkApplicationId;
    @SerializedName(" virtual_Application")
    public ApplicationAppModel  virtual_Application;
    @SerializedName("Application")
    public ApplicationAppModel Application;
    @SerializedName("LinkLayoutId")
    public long LinkLayoutId;
    @SerializedName(" virtual_Layout")
    public ApplicationLayoutModel  virtual_Layout;
    @SerializedName("Layout")
    public ApplicationLayoutModel Layout;
    @SerializedName("JsonFormValues")
    public String JsonFormValues;
}
package ntk.android.base.entitymodel.application;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class ApplicationLayoutValueModel extends BaseModuleEntity<Long> {

    @SerializedName("linkApplicationId")
    public long linkApplicationId;
    @SerializedName("virtual_Application")
    public ApplicationAppModel virtual_Application;
    @SerializedName("application")
    public ApplicationAppModel application;
    @SerializedName("linkLayoutId")
    public long linkLayoutId;
    @SerializedName("virtual_Layout")
    public ApplicationLayoutModel virtual_Layout;
    @SerializedName("layout")
    public ApplicationLayoutModel layout;
    @SerializedName("jsonFormValues")
    public String jsonFormValues;
}
package ntk.android.base.entitymodel.base;

import com.google.gson.annotations.SerializedName;

class FormInfoModel {
    @SerializedName("formAllowSubmit")
    boolean formAllowSubmit = true;
    @SerializedName("formAlert")
    String formAlert = "";
    @SerializedName("formError")
    String formError = "";
    @SerializedName("formErrorStatus")
    boolean formErrorStatus = false;
    @SerializedName("disabledButtonSubmitted")
    boolean disabledButtonSubmitted = false;
}

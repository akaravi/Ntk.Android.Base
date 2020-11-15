package ntk.android.base.entitymodel.base;

import com.google.gson.annotations.SerializedName;

class FormInfoModel {
    @SerializedName("FormAllowSubmit")
    boolean FormAllowSubmit = true;
    @SerializedName("FormAlert")
    String FormAlert = "";
    @SerializedName("FormError")
    String FormError = "";
    @SerializedName("FormErrorStatus")
    boolean FormErrorStatus = false;
    @SerializedName("DisabledButtonSubmitted")
    boolean DisabledButtonSubmitted = false;
}

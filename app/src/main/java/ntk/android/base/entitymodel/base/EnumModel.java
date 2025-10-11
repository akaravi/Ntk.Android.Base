package ntk.android.base.entitymodel.base;

import com.google.gson.annotations.SerializedName;

class EnumModel {
    @SerializedName("Key")
    String Key;
    @SerializedName("Value")
    long Value;
    @SerializedName("Description")
    String Description;
}

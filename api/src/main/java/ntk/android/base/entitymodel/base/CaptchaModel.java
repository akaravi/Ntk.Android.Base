package ntk.android.base.entitymodel.base;

import com.google.gson.annotations.SerializedName;

public class CaptchaModel {
    @SerializedName("Expire")
    public String Expire;
    @SerializedName("Key")
    public String Key;
    @SerializedName("Image")
    public String Image;
}

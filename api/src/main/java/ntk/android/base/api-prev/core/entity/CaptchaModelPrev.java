package ntk.android.base.api.core.entity;

import com.google.gson.annotations.SerializedName;

public class CaptchaModelPrev {
    @SerializedName("Expire")
    public String Expire;

    @SerializedName("Key")
    public String Key;

    @SerializedName("image")
    public String image;
}

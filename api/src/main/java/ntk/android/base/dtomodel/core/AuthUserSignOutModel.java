package ntk.android.base.dtomodel.core;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AuthUserSignOutModel {
    @SerializedName("Tokens")
    List<String> Tokens;
    @SerializedName("AllToken")
    boolean AllToken = false;
}

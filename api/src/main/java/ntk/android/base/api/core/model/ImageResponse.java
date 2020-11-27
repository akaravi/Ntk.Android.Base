package ntk.android.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.core.entity.ImageInfoPrev;

public class ImageResponse extends ErrorExceptionPrev {

    @SerializedName("Images")
    public List<ImageInfoPrev> Images;
}

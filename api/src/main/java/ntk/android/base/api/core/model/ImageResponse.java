package ntk.android.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.core.entity.ImageInfo;

public class ImageResponse extends ErrorException {

    @SerializedName("Images")
    public List<ImageInfo> Images;
}

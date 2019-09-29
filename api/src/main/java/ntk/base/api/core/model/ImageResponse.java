package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.core.viewModel.ImageInfo;

public class ImageResponse extends ErrorException {

    @SerializedName("Images")
    public List<ImageInfo> Images;
}

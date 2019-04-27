package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ImageResponse extends ErrorException {

    @SerializedName("Images")
    public List<ImageInfo> Images;
}

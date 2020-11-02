package ntk.android.base.api.file.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.file.entity.FileContent;

public class FileContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<FileContent> ListItems;

    @SerializedName("Item")
    public FileContent Item;
}

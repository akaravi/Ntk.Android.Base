package ntk.android.base.api.file.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.file.entity.FileContentPrev;

public class FileContentResponse extends ErrorExceptionPrev {

    @SerializedName("ListItems")
    public List<FileContentPrev> ListItems;

    @SerializedName("Item")
    public FileContentPrev Item;
}

package ntk.android.base.api.file.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.file.entity.FileCategory;

public class FileCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<FileCategory> ListItems;

    @SerializedName("Item")
    public FileCategory Item;
}

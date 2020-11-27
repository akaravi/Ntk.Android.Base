package ntk.android.base.api.file.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.file.entity.FileCategoryPrev;

public class FileCategoryResponse extends ErrorExceptionPrev {

    @SerializedName("ListItems")
    public List<FileCategoryPrev> ListItems;

    @SerializedName("Item")
    public FileCategoryPrev Item;
}

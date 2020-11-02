package ntk.android.base.entityModel.base;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ErrorException<TEntity> extends ErrorExceptionBase {

    @SerializedName("ListItems")
    public List<TEntity> ListItems;
    @SerializedName("Item")
    public TEntity Item;

}


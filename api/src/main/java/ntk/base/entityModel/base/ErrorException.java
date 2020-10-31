package ntk.base.entityModel.base;

import java.util.List;

public class ErrorException<TEntity> extends ErrorExceptionBase {

    public List<TEntity> ListItems;
    public TEntity Item;

}


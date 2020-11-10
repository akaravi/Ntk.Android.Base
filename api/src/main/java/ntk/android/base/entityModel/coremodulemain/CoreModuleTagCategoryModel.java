package ntk.android.base.entitymodel.coremodulemain;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class CoreModuleTagCategoryModel extends BaseModuleEntity<Long> {
    String Title;
    String TitleResourceLanguage;
    String Description;
    String FontIcon;
    String LinkParentIdNode;
    long LinkParentId;
    CoreModuleTagCategoryModel Category;
    // tslint:disable-next-line: variable-name
    CoreModuleTagCategoryModel virtual_Category;
    List<CoreModuleTagCategoryModel> Children;
    List<CoreModuleTagModel> Tags;

}

import { BaseEntity } from '../base/baseEntity';
import { BaseModuleEntity } from '../base/baseModuleEntity';
import { CoreModuleTagCategoryModel } from './coreModuleTagCategoryModel';


public class CoreModuleTagModel extends BaseModuleEntity<number> {
  Title: string;
  LinkCategoryId: string;
  Category: CoreModuleTagCategoryModel;

}

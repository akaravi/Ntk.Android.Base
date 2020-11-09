package ntk.android.base.entityModel.coremodulelog;

public  class CoreLogLikeModel  BaseModuleEntity<String>  {


    moduleName: string;
    moduleEntityName: string;
    linkUserId?: number;
    linkMemberUserId?: number;
    entityId: number;
    likked: boolean;
    existBeforAndChangeNow: boolean;
}

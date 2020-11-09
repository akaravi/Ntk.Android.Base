public  class CoreLogErrorModel extends  BaseEntity<string> {

    moduleName: string;
    moduleEntityName: string;
    linkUserId?: number;
    linkMemberUserId?: number;
    entityId: number;
    description: string;

}

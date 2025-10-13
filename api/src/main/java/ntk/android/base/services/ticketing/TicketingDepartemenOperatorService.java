package ntk.android.base.services.ticketing;

import android.content.Context;

import ntk.android.base.entitymodel.ticketing.TicketingDepartemenOperatorModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class TicketingDepartemenOperatorService extends CmsApiServerBase<TicketingDepartemenOperatorModel, Long> {


    TicketingDepartemenOperatorService(Context context) {
        super(context, "TicketingDepartemenOperator", TicketingDepartemenOperatorModel.class);
    }


}

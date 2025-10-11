package ntk.android.base.services.ticketing;

import android.content.Context;

import ntk.android.base.entitymodel.ticketing.TicketingDepartemenModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class TicketingDepartemenLogService extends CmsApiServerBase<TicketingDepartemenModel, Long> {


    TicketingDepartemenLogService(Context context) {
        super(context, "TicketingDepartemen", TicketingDepartemenModel.class);
    }


}

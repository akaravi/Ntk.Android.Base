package ntk.android.base.services.ticketing;

import android.content.Context;

import ntk.android.base.entitymodel.ticketing.TicketingAnswerModel;
import ntk.android.base.entitymodel.ticketing.TicketingDepartemenModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class TicketingDepartemenService extends CmsApiServerBase<TicketingDepartemenModel, Long> {


    public TicketingDepartemenService(Context context) {
        super(context, "TicketingDepartemen", TicketingDepartemenModel.class);
    }


}

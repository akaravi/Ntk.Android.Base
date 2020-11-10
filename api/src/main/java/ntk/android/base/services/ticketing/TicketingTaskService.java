package ntk.android.base.services.ticketing;

import android.content.Context;

import ntk.android.base.entitymodel.ticketing.TicketingTaskModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class TicketingTaskService extends CmsApiServerBase<TicketingTaskModel, Long> {


    TicketingTaskService(Context context) {
        super(context, "TicketingTask", TicketingTaskModel.class);
    }


}

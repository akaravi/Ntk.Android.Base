package ntk.android.base.services.ticketing;

import android.content.Context;

import ntk.android.base.entitymodel.ticketing.TicketingAnswerModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class TicketingTaskService  extends CmsApiServerBase<TicketingAnswerModel, Long> {


    TicketingTaskService(Context context) {
        super(context, "TicketingAnswer", TicketingAnswerModel.class);
    }


}

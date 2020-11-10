package ntk.android.base.services.ticketing;

import android.content.Context;

import ntk.android.base.entitymodel.ticketing.TicketingAnswerModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class TicketingAnswerService extends CmsApiServerBase<TicketingAnswerModel, Long> {


    TicketingAnswerService(Context context) {
        super(context, "TicketingAnswer", TicketingAnswerModel.class);
    }


}

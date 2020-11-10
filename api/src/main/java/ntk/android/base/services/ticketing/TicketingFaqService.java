package ntk.android.base.services.ticketing;

import android.content.Context;

import ntk.android.base.entitymodel.ticketing.TicketingFaqModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class TicketingFaqService extends CmsApiServerBase<TicketingFaqModel, Long> {


    public TicketingFaqService(Context context) {
        super(context, "TicketingFaq", TicketingFaqModel.class);
    }


}

package ntk.android.base.services.ticketing;

import android.content.Context;

import ntk.android.base.entitymodel.ticketing.TicketingTemplateModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class TicketingTemplateService extends CmsApiServerBase<TicketingTemplateModel, Long> {

    TicketingTemplateService(Context context) {
        super(context, "TicketingTemplate", TicketingTemplateModel.class);
    }
}

package ntk.android.base.services.pooling;

import android.content.Context;

import ntk.android.base.entitymodel.polling.PollingVoteModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class PollingVoteService extends CmsApiServerBase<PollingVoteModel, Long> {


    public    PollingVoteService(Context context) {
        super(context, "PollingVote", PollingVoteModel.class);
    }
}

package ntk.android.base.services.pooling;

import android.content.Context;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.polling.PollingVoteModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class PollingVoteService extends CmsApiServerBase<PollingVoteModel, Long> {


    public PollingVoteService(Context context) {
        super(context, "PollingVote", PollingVoteModel.class);
    }

    public Observable<ErrorException<PollingVoteModel>> addBatch(List<PollingVoteModel> models) {
        BehaviorSubject<ErrorException<PollingVoteModel>> mMovieCache = BehaviorSubject.create();
        ICmsApiPolling icp = getRetrofit(ICmsApiPolling.class);
        icp.AddBatch(baseUrl + controlerUrl + "/AddBatch", headers, models)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<PollingVoteModel>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<PollingVoteModel> pollingVoteModelErrorException) {
                mMovieCache.onNext(pollingVoteModelErrorException);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                mMovieCache.onError(e);
            }

            @Override
            public void onComplete() {

            }
        });
        return mMovieCache;
    }
}

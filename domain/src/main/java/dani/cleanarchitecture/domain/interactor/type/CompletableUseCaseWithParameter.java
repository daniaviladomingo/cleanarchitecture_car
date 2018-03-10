package dani.cleanarchitecture.domain.interactor.type;

import io.reactivex.Completable;

public interface CompletableUseCaseWithParameter<P> {

    Completable execute(P parameter);
}

package dani.cleanarchitecture.domain.interactor.type;

import io.reactivex.Completable;

public interface ICompletableUseCaseWithParameter<P> {

    Completable execute(P parameter);
}

package dani.cleanarchitecture.domain.interactor.type;

import io.reactivex.Observable;

public interface IUseCaseWithParameter<P, R> {

    Observable<R> execute(P parameter);
}

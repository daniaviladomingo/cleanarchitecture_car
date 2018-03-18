package dani.cleanarchitecture.domain.interactor.type;

import io.reactivex.Single;

public interface ISingleUseCaseWithParameter<P, R> {

    Single<R> execute(P parameter);
}

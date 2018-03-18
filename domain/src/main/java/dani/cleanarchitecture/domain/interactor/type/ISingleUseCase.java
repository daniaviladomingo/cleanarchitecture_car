package dani.cleanarchitecture.domain.interactor.type;

import io.reactivex.Single;

public interface ISingleUseCase<T> {

    Single<T> execute();
}

package dani.cleanarchitecture.domain.interactor.type;

import io.reactivex.Observable;

public interface IUseCase<T> {

    Observable<T> execute();
}

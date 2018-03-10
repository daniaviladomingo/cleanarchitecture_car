package dani.cleanarchitecture.domain.interactor.type;

import io.reactivex.Observable;

public interface UseCase<T> {

    Observable<T> execute();
}

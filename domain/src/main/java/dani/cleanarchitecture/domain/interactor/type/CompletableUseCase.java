package dani.cleanarchitecture.domain.interactor.type;

import io.reactivex.Completable;

public interface CompletableUseCase {

    Completable execute();
}

package mireya.com.school.domain.ratings.interactor;

import mireya.com.school.domain.ratings.presenter.RatingsPresenter;

public class RatingsInteractorImpl implements RatingsInteractor {
    private RatingsPresenter presenter;

    public RatingsInteractorImpl(RatingsPresenter presenter) {
        this.presenter = presenter;
    }
}

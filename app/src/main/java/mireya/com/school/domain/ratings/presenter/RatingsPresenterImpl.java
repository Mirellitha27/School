package mireya.com.school.domain.ratings.presenter;

import mireya.com.school.domain.ratings.interactor.RatingsInteractor;
import mireya.com.school.domain.ratings.interactor.RatingsInteractorImpl;
import mireya.com.school.domain.ratings.view.RatingsView;

public class RatingsPresenterImpl implements RatingsPresenter {
    private RatingsView view;
    private RatingsInteractor interactor;

    public RatingsPresenterImpl(RatingsView view) {
        this.view = view;
        interactor = new RatingsInteractorImpl(this);
    }
}

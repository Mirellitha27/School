package mireya.com.school.domain.main.interactor;

import mireya.com.school.domain.main.presenter.MainPresenter;

public class MainInteractorImpl implements MainInteractor{
    private MainPresenter presenter;

    public MainInteractorImpl(MainPresenter presenter) {
        this.presenter = presenter;
    }
}

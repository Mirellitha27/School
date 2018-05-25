package mireya.com.school.domain.splash.interactor;

import mireya.com.school.domain.splash.presenter.SplashPresenter;

public class SplashInteractorImpl implements SplashInteractor {
    private SplashPresenter presenter;

    public SplashInteractorImpl(SplashPresenter presenter) {
        this.presenter = presenter;
    }
}

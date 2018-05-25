package mireya.com.school.domain.splash.presenter;

import mireya.com.school.domain.splash.interactor.SplashInteractor;
import mireya.com.school.domain.splash.interactor.SplashInteractorImpl;
import mireya.com.school.domain.splash.view.SplashView;

public class SplashPresenterImpl implements SplashPresenter {
    private SplashView view;
    private SplashInteractor interactor;

    public SplashPresenterImpl(SplashView view) {
        this.view = view;
        interactor = new SplashInteractorImpl(this);
    }
}

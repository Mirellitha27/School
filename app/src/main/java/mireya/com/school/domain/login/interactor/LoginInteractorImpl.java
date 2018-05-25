package mireya.com.school.domain.login.interactor;

import mireya.com.school.domain.login.presenter.LoginPresenter;

public class LoginInteractorImpl implements LoginInteractor {
    private LoginPresenter presenter;

    public LoginInteractorImpl(LoginPresenter presenter) {
        this.presenter = presenter;
    }
}

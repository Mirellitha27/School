package mireya.com.school.domain.login.presenter;

import mireya.com.school.domain.login.interactor.LoginInteractor;
import mireya.com.school.domain.login.interactor.LoginInteractorImpl;
import mireya.com.school.domain.login.view.LoginView;

public class LoginPresenterImpl implements LoginPresenter {
    private LoginView view;
    private LoginInteractor interactor;

    public LoginPresenterImpl(LoginView view) {
        this.view = view;
        interactor = new LoginInteractorImpl(this);
    }
}

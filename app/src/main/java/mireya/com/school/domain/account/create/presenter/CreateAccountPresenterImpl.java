package mireya.com.school.domain.account.create.presenter;

import mireya.com.school.domain.account.create.interactor.CreateAccountInteractor;
import mireya.com.school.domain.account.create.interactor.CreateAccountInteractorImpl;
import mireya.com.school.domain.account.create.view.CreateAccountView;

public class CreateAccountPresenterImpl implements CreateAccountPresenter {
    private CreateAccountView view;
    private CreateAccountInteractor interactor;

    public CreateAccountPresenterImpl(CreateAccountView view) {
        this.view = view;
        interactor = new CreateAccountInteractorImpl(this);
    }
}

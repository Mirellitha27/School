package mireya.com.school.domain.account.create.interactor;

import mireya.com.school.domain.account.create.presenter.CreateAccountPresenter;

public class CreateAccountInteractorImpl implements CreateAccountInteractor {
    private CreateAccountPresenter presenter;

    public CreateAccountInteractorImpl(CreateAccountPresenter presenter) {
        this.presenter = presenter;
    }
}

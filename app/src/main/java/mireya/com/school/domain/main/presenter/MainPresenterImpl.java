package mireya.com.school.domain.main.presenter;

import mireya.com.school.domain.main.interactor.MainInteractor;
import mireya.com.school.domain.main.interactor.MainInteractorImpl;
import mireya.com.school.domain.main.view.MainView;

public class MainPresenterImpl implements MainPresenter {
    private MainView view;
    private MainInteractor interactor;

    public MainPresenterImpl(MainView view) {
        this.view = view;
        interactor = new MainInteractorImpl(this);
    }
}

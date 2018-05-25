package mireya.com.school.domain.settings.presenter;

import mireya.com.school.domain.settings.interactor.SettingsInteractor;
import mireya.com.school.domain.settings.interactor.SettingsInteractorImpl;
import mireya.com.school.domain.settings.view.SettingsFragmentView;

public class SettingsPresenterImpl implements SettingsPresenter {
    private SettingsFragmentView view;
    private SettingsInteractor interactor;

    public SettingsPresenterImpl(SettingsFragmentView view) {
        this.view = view;
        interactor = new SettingsInteractorImpl(this);
    }

}

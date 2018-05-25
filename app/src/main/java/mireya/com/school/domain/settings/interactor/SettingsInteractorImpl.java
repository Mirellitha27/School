package mireya.com.school.domain.settings.interactor;

import mireya.com.school.domain.settings.presenter.SettingsPresenter;

public class SettingsInteractorImpl implements SettingsInteractor {
    private SettingsPresenter presenter;

    public SettingsInteractorImpl(SettingsPresenter presenter) {
        this.presenter = presenter;
    }
}

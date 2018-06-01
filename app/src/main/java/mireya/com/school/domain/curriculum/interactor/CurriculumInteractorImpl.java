package mireya.com.school.domain.curriculum.interactor;

import mireya.com.school.domain.curriculum.presenter.CurriculumPresenter;

public class CurriculumInteractorImpl implements CurriculumInteractor {
    private CurriculumPresenter presenter;

    public CurriculumInteractorImpl(CurriculumPresenter presenter) {
        this.presenter = presenter;
    }
}

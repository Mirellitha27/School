package mireya.com.school.domain.curriculum.presenter;

import mireya.com.school.domain.curriculum.interactor.CurriculumInteractor;
import mireya.com.school.domain.curriculum.interactor.CurriculumInteractorImpl;
import mireya.com.school.domain.curriculum.view.CurriculumView;

public class CurriculumPresenterImpl implements CurriculumPresenter {
    private CurriculumView view;
    private CurriculumInteractor interactor;

    public CurriculumPresenterImpl(CurriculumView view) {
        this.view = view;
        interactor = new CurriculumInteractorImpl(this);
    }

    @Override
    public void goMain() {
        view.goMain();
    }
}

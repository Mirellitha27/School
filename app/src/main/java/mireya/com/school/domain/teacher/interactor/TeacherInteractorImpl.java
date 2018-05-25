package mireya.com.school.domain.teacher.interactor;

import mireya.com.school.domain.teacher.presenter.TeacherPresenter;

public class TeacherInteractorImpl implements TeacherInteractor {
    private TeacherPresenter presenter;

    public TeacherInteractorImpl(TeacherPresenter presenter) {
        this.presenter = presenter;
    }
}

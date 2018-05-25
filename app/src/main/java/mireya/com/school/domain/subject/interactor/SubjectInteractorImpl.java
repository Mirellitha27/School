package mireya.com.school.domain.subject.interactor;

import mireya.com.school.domain.subject.presenter.SubjectPresenter;

public class SubjectInteractorImpl implements SubjectInteractor {
    private SubjectPresenter presenter;

    public SubjectInteractorImpl(SubjectPresenter presenter) {
        this.presenter = presenter;
    }
}

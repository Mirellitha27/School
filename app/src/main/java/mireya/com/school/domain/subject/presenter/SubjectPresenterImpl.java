package mireya.com.school.domain.subject.presenter;

import mireya.com.school.domain.subject.interactor.SubjectInteractor;
import mireya.com.school.domain.subject.interactor.SubjectInteractorImpl;
import mireya.com.school.domain.subject.view.SubjectFragmentView;

public class SubjectPresenterImpl implements SubjectPresenter {
    private SubjectFragmentView view;
    private SubjectInteractor interactor;

    public SubjectPresenterImpl(SubjectFragmentView view) {
        this.view = view;
        interactor = new SubjectInteractorImpl(this);
    }
}

package mireya.com.school.domain.teacher.presenter;

import java.util.List;

import mireya.com.school.domain.teacher.data.TeacherData;
import mireya.com.school.domain.teacher.interactor.TeacherInteractor;
import mireya.com.school.domain.teacher.interactor.TeacherInteractorImpl;
import mireya.com.school.domain.teacher.view.TeacherFragmentView;

public class TeacherPresenterImpl implements TeacherPresenter {
    private TeacherFragmentView view;
    private TeacherInteractor interactor;

    public TeacherPresenterImpl(TeacherFragmentView view) {
        this.view = view;
        interactor = new TeacherInteractorImpl(this);
    }

    @Override
    public void setDataAdapter(List<TeacherData> teacherData) {
        view.setDataAdapter(teacherData);
    }
}

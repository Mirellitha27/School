package mireya.com.school.domain.teacher.view;

import android.support.v4.app.Fragment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mireya.com.school.R;
import mireya.com.school.domain.teacher.presenter.TeacherPresenter;
import mireya.com.school.domain.teacher.presenter.TeacherPresenterImpl;

public class TeacherFragment extends Fragment implements TeacherFragmentView {
    public static String IDENTIFIER = "TEACHER_FRAGMENT";
    private TeacherPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_teacher, container, false);
        setUpVariable();
        setUpView(view);
        return view;
    }

    private void setUpVariable() {
        if (presenter == null) {
            presenter = new TeacherPresenterImpl(this);
        }
    }

    private void setUpView(View view) {
    }

}

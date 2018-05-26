package mireya.com.school.domain.teacher.view;

import android.support.v4.app.Fragment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import mireya.com.school.R;
import mireya.com.school.domain.teacher.adapter.TeacherAdapter;
import mireya.com.school.domain.teacher.data.TeacherData;
import mireya.com.school.domain.teacher.presenter.TeacherPresenter;
import mireya.com.school.domain.teacher.presenter.TeacherPresenterImpl;

public class TeacherFragment extends Fragment implements TeacherFragmentView {
    public static String IDENTIFIER = "TEACHER_FRAGMENT";
    private TeacherPresenter presenter;
    private RecyclerView recyclerView;
    private List<TeacherData> teacherData;

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
        /*recyclerView = view.findViewById(R.id.recyclerView);

            teacherData = new ArrayList<>();
            teacherData.add(new TeacherData("Mireya Jimenez", "Developed Android"));
            teacherData.add(new TeacherData("Luis Manuel Castillo Zamorano", "Developed IOS"));
            teacherData.add(new TeacherData("Rott Castillo", "Especialista en no hacer nada"));

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);*/
    }

    @Override
    public void setDataAdapter(List<TeacherData> teacherData) {
        TeacherAdapter teacherAdapter = new TeacherAdapter(getContext(), teacherData);
        recyclerView.setAdapter(teacherAdapter);
        teacherAdapter.notifyDataSetChanged();
    }
}

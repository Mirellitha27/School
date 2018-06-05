package mireya.com.school.domain.teacher.view;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.app.Fragment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import mireya.com.school.R;
import mireya.com.school.domain.curriculum.view.CurriculumActivity;
import mireya.com.school.domain.teacher.adapter.TeacherAdapter;
import mireya.com.school.domain.teacher.data.TeacherData;
import mireya.com.school.domain.teacher.presenter.TeacherPresenter;
import mireya.com.school.domain.teacher.presenter.TeacherPresenterImpl;

import static android.content.Context.CONNECTIVITY_SERVICE;

public class TeacherFragment extends Fragment implements TeacherFragmentView {
    public static String IDENTIFIER = "TEACHER_FRAGMENT";
    private final String TAG = this.getClass().getSimpleName();
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
        List<TeacherData> teacherData = new ArrayList<>();
        teacherData.add(new TeacherData("Mireya Jimenez Perez", "Programación Android"));
        teacherData.add(new TeacherData("Luis Manuel Castillo", "Programación IOS"));
        teacherData.add(new TeacherData("Dolores Zamorano", "Diseño Arquitectura"));
        teacherData.add(new TeacherData("José Ricardo Zamorano", "Construccion"));

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView.Adapter adapter = new TeacherAdapter(getContext(), presenter, teacherData);
        recyclerView.setAdapter(adapter);

        if (amIConnected()){
            Log.d(TAG, "Conectado");
        }else {
            Log.d(TAG, "no conectado");
        }

    }

    private boolean amIConnected(){
        ConnectivityManager connectivityManager = (ConnectivityManager) Objects.requireNonNull(getContext()).getSystemService(CONNECTIVITY_SERVICE);
        assert connectivityManager != null;
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }

    @Override
    public void goCurriculum() {
        Intent intent = new Intent(getContext(), CurriculumActivity.class);
        startActivity(intent);
    }
}

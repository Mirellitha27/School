package mireya.com.school.domain.subject.view;

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
import mireya.com.school.domain.subject.adapter.SubjectAdapter;
import mireya.com.school.domain.subject.data.SubjectData;
import mireya.com.school.domain.subject.presenter.SubjectPresenter;
import mireya.com.school.domain.subject.presenter.SubjectPresenterImpl;

public class SubjectFragment extends Fragment implements SubjectFragmentView {

    public static String IDENTIFIER = "SUBJECT_FRAGMENT";
    private SubjectPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_subject, container, false);
        setUpVariable();
        setUpView(view);
        return view;
    }

    private void setUpVariable() {
        if (presenter == null) {
            presenter = new SubjectPresenterImpl(this);
        }
    }

    private void setUpView(View view) {
        List<SubjectData> teacherData = new ArrayList<>();
        teacherData.add(new SubjectData("Programación IOS", "Luis Manuel Castillo"));
        teacherData.add(new SubjectData("Programación Android", "Ana Mireya Jimenez"));

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView.Adapter adapter = new SubjectAdapter(teacherData);
        recyclerView.setAdapter(adapter);
    }
}

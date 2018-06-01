package mireya.com.school.domain.curriculum.view;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import mireya.com.school.R;
import mireya.com.school.domain.curriculum.adapter.CurriculumAdapter;
import mireya.com.school.domain.curriculum.data.CurriculumData;
import mireya.com.school.domain.curriculum.presenter.CurriculumPresenter;
import mireya.com.school.domain.curriculum.presenter.CurriculumPresenterImpl;

public class CurriculumActivity extends AppCompatActivity implements CurriculumView{
    private CurriculumPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curriculum);
        setupVariable();
        setUpView();
    }

    private void setupVariable() {
        if (presenter == null) {
            presenter = new CurriculumPresenterImpl(this);
        }
    }

    private void setUpView() {
        List<CurriculumData> teacherData = new ArrayList<>();
        teacherData.add(new CurriculumData("Programacion IOs", "Año - 2018"));
        teacherData.add(new CurriculumData("Programacion web", "Año -  2017"));
        teacherData.add(new CurriculumData("Creacion de Apis", "Año -  2016"));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        //GridLayoutManager linearLayoutManager = new GridLayoutManager(this, 2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView.Adapter adapter = new CurriculumAdapter(teacherData);
        recyclerView.setAdapter(adapter);

    }
}

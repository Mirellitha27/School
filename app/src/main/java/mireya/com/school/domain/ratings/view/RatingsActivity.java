package mireya.com.school.domain.ratings.view;

import android.content.Intent;
import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import mireya.com.school.R;
import mireya.com.school.domain.main.view.MainActivity;
import mireya.com.school.domain.ratings.adapter.RatingsAdapter;
import mireya.com.school.domain.ratings.data.RatingsData;
import mireya.com.school.domain.ratings.presenter.RatingsPresenter;
import mireya.com.school.domain.ratings.presenter.RatingsPresenterImpl;

public class RatingsActivity extends AppCompatActivity implements RatingsView{
    private RatingsPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratings);
        setupVariable();
        setUpView();
        /*ratingsData = new ArrayList<>();
        ratingsData.add(new RatingsData("80", "primer parcial"));
        ratingsData.add(new RatingsData("70", "Segundo parcial"));

        /*RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerView);
        RatingsAdapter myAdapter = new RatingsAdapter(this,ratingsData);
        myrv.setLayoutManager(new GridLayoutManager(this, 3));
        myrv.setAdapter(myAdapter);*/
    }

    private void setupVariable() {
        if (presenter == null) {
            presenter = new RatingsPresenterImpl(this);
        }
    }

    private void setUpView() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(" ");

        List<RatingsData> teacherData = new ArrayList<>();
        teacherData.add(new RatingsData("80", "primer parcial"));
        teacherData.add(new RatingsData("70", "Segundo parcial"));
        teacherData.add(new RatingsData("80", "tercer parcial"));
        teacherData.add(new RatingsData("70", "calificacion final"));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView.Adapter adapter = new RatingsAdapter(teacherData);
        recyclerView.setAdapter(adapter);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case android.R.id.home:
                goMain();
                break;
        }
        return true;
    }

    @Override
    public void goMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}

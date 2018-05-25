package mireya.com.school.domain.account.create.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import mireya.com.school.R;
import mireya.com.school.domain.account.create.presenter.CreateAccountPresenter;
import mireya.com.school.domain.account.create.presenter.CreateAccountPresenterImpl;
import mireya.com.school.domain.login.view.LoginActivity;

public class CreateAccountActivity extends AppCompatActivity implements CreateAccountView{

    CreateAccountPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        setupVariable();
        setUpView();
    }

    private void setupVariable() {
        if (presenter == null) {
            presenter = new CreateAccountPresenterImpl(this);
        }
    }

    private void setUpView() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(" ");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case android.R.id.home:
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                finish();
                break;
        }
        return true;
    }
}

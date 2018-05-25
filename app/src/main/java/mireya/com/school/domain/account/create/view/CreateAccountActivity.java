package mireya.com.school.domain.account.create.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mireya.com.school.R;
import mireya.com.school.domain.account.create.presenter.CreateAccountPresenter;
import mireya.com.school.domain.account.create.presenter.CreateAccountPresenterImpl;

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
    }
}

package mireya.com.school.domain.login.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mireya.com.school.R;
import mireya.com.school.domain.login.presenter.LoginPresenter;
import mireya.com.school.domain.login.presenter.LoginPresenterImpl;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private LoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setupVariable();
        setUpView();
    }

    private void setupVariable() {
        if (presenter == null) {
            presenter = new LoginPresenterImpl(this);
        }
    }

    private void setUpView() {
    }
}

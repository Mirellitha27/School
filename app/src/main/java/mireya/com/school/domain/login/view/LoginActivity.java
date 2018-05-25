package mireya.com.school.domain.login.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mireya.com.school.R;
import mireya.com.school.domain.account.create.view.CreateAccountActivity;
import mireya.com.school.domain.login.presenter.LoginPresenter;
import mireya.com.school.domain.login.presenter.LoginPresenterImpl;
import mireya.com.school.domain.main.view.MainActivity;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private LoginPresenter presenter;
    private Button btnSignIn, btnSignUp;
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
        btnSignIn = findViewById(R.id.btnSignIn);
        btnSignIn.setEnabled(true);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnSignUp = findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, CreateAccountActivity.class));
                finish();
            }
        });
    }
}

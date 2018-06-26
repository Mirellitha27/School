package mireya.com.school.domain.login.view;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import mireya.com.school.R;
import mireya.com.school.domain.account.create.view.CreateAccountActivity;
import mireya.com.school.domain.login.model.LoginData;
import mireya.com.school.domain.login.presenter.LoginPresenter;
import mireya.com.school.domain.login.presenter.LoginPresenterImpl;
import mireya.com.school.domain.main.view.MainActivity;
import mireya.com.school.utils.Keyboard.KeyboardUtil;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private LoginPresenter presenter;
    private TextView edPassword;
    private Button btnSignIn, btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


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
        edPassword = findViewById(R.id.edPassword);
        edPassword.setText("hola jim");
        presenter = new LoginPresenterImpl(this);
        getDataUser();
    }


    @Override
    public void getDataUser() {
        presenter.getDataUser();
    }

    @Override
    public void showDataUser(LoginData user) {
        //edPassword.setText(user.getName());
        edPassword.setText("hola jim");
        Log.d("tag", "hola");
    }

    @Override
    public void goPostList() {

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        KeyboardUtil.hide(this);
        return true;
    }
}
